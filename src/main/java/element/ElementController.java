package element;

import http.HttpStatusCode;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;

public class ElementController {

    public void requestHandle(HttpServletRequest req, HttpServletResponse resp, ElementRepository repo) throws IOException, URISyntaxException {
        URI reqUri = new URI(req.getRequestURI());
        String output = "";
        String h = req.getHeader("accept").split(",")[0];
        String headers = (h.equals("*/*"))? null : String.format("accept:%s", h);

        if(reqUri.getPath().equals("/")){
            output = ElemViewIndex.output;
        }
        else{
            output = ElemView.output;
        }

        writeResponse(resp, headers, output, HttpStatusCode.Ok.valueOf());
    }

    private void writeResponse(HttpServletResponse resp, String outFormat, String output, int statusCode) throws IOException{
        resp.setContentType(String.format("text/html;charset=UTF-8"));

        byte[] respBodyBytes = output.getBytes("UTF-8");
        resp.setStatus(statusCode);
        resp.setContentLength(respBodyBytes.length);
        OutputStream os = resp.getOutputStream();
        os.write(respBodyBytes);
        os.close();
    }



}
