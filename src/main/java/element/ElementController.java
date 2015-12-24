package element;

import http.HttpResponse;
import http.HttpStatusCode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.sql.SQLException;
import java.util.Scanner;

public class ElementController {

    public HttpResponse handleGetElementByCode(HttpServletRequest req, String code) throws Exception{
        Element e = repo.getByCode(code);
        if(e == null) return new HttpResponse(HttpStatusCode.NotFound);
        //return new HttpResponse(HttpStatusCode.Ok, new ElemViewIndex(e));
        requestHandle();
        return new HttpResponse(HttpStatusCode.Ok, resp, new ElemViewIndex(e));
    }

    public void requestHandle(HttpServletRequest req, HttpServletResponse resp) throws IOException, URISyntaxException {
        URI reqUri = new URI(req.getRequestURI());
        String method = req.getMethod();

        try {
            TemplateValidator.checkPath(reqUri.getPath());
            String path = reqUri.getPath();
            String h = req.getHeader("accept").split(",")[0];
            String headers = (h.equals("*/*"))? null : String.format("accept:%s", h);
            String parameters = getParameters(req);

            Request r = new Request();
            r.setMethod(method);
            r.setPath(path);
            r.setParameters(parameters);
            r.setHeaders(headers);
            r.setServer(server);
            String output = r.execute(cM);

            switch(method){
                case "GET":
                    writeResponse(resp, r.getHeaders().getString("accept"), output, OK);
                    break;
                case "POST":
                    writePostResponse(resp, path, output, SEE_OTHER);
                    break;
            }


        }
        catch(CommandNotFoundException | InvalidParameterException | GetErrorException | InvalidTemplateException e){
            String errorMsg = formatExceptionMsg(e.getMessage());
            writeResponse(resp, "text/html", errorMsg, BAD_REQUEST);
        }
        catch (SQLException e){
            boolean connError = false;
            Scanner sc = new Scanner(e.getMessage());

            while(sc.hasNext() && !connError)
                if(sc.next().startsWith("connection"))
                    connError = true;

            if (connError){
                String errorMsg = formatExceptionMsg("Service Unavailable");
                writeResponse(resp, "text/html", errorMsg, SERVICE_UNAVAILABLE);
            }
            else{
                String errorMsg = formatExceptionMsg("Internal Server Error");
                writeResponse(resp, "text/html", errorMsg, INTERNAL_SERVER_ERROR);
            }
        }
        catch (UnsupportedMediaTypeException e){
            String errorMsg = formatExceptionMsg(e.getMessage());
            writeResponse(resp, "text/html", errorMsg, UNSUPPORTED_MEDIA_TYPE);
        }
        catch (Exception e) {
            resp.setStatus(INTERNAL_SERVER_ERROR);
        }
    }

    private void writeResponse(HttpServletResponse resp, String outFormat, String output, int statusCode) throws IOException{
        Charset utf8 = Charset.forName("utf-8");
        resp.setContentType(String.format("%s; charset=%s", outFormat, utf8.name()));

        byte[] respBodyBytes = output.getBytes(utf8);
        resp.setStatus(statusCode);
        resp.setContentLength(respBodyBytes.length);
        OutputStream os = resp.getOutputStream();
        os.write(respBodyBytes);
        os.close();
    }



}
