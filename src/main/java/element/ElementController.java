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
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class ElementController {

//    public HttpResponse handleGetElementByCode(HttpServletRequest req, String code) throws Exception{
//        Element e = repo.getByCode(code);
//        if(e == null) return new HttpResponse(HttpStatusCode.NotFound);
//        //return new HttpResponse(HttpStatusCode.Ok, new ElemViewIndex(e));
//        requestHandle(req, resp, e);
//        return new HttpResponse(HttpStatusCode.Ok, resp, new ElemViewIndex(e));
//    }

    public void requestHandle(HttpServletRequest req, HttpServletResponse resp, Element e) throws IOException, URISyntaxException {
        URI reqUri = new URI(req.getRequestURI());
        String method = req.getMethod();

        String path = reqUri.getPath();
        String h = req.getHeader("accept").split(",")[0];
        String headers = (h.equals("*/*"))? null : String.format("accept:%s", h);
        String parameters = getParameters(req);

        String output = String.format(ElemViewIndex.output, e.getCode());

        writeResponse(resp, headers, output, HttpStatusCode.Ok.valueOf());
    }

    private String getParameters(HttpServletRequest req){
        Map<String,String[]> map = req.getParameterMap();

        if(map.size()==0)
            return null;

        StringBuffer sb = new StringBuffer();

        Iterator<Map.Entry<String,String[]>> it = map.entrySet().iterator();

        for(Map.Entry<String,String[]> e; it.hasNext(); ){
            e = it.next();
            sb.append(e.getKey());
            sb.append("=");
            sb.append(e.getValue()[0].replace(' ', '+'));
            sb.append("&");
        }

        String p = sb.toString();
        int endIdx = p.length()-1;
        return p.substring(0,endIdx);
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
