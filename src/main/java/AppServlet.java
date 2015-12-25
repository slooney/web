import element.ElementController;
import element.ElementRepository;
import http.HttpResponse;
import http.HttpStatusCode;
import org.joda.time.DateTime;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        Charset utf8 = Charset.forName("utf-8");
        resp.setContentType(String.format("text/plain; charset=%s",utf8.name()));

        doMethod(req, resp);
        //String respBody = String.format("Current date and time is %s\nVersion:0.4.0",new DateTime().toString());

        //byte[] respBodyBytes = respBody.getBytes(utf8);
        //resp.setStatus(200);
        //resp.setContentLength(respBodyBytes.length);
        //OutputStream os = resp.getOutputStream();
        //os.write(respBodyBytes);
        //os.close();
    }

    private void doMethod (HttpServletRequest req, HttpServletResponse resp) throws IOException{
        try{
            validateHandle(req,resp);
        }
        catch(Throwable t){
            new HttpResponse(HttpStatusCode.InternalServerError).send(resp);

        }
    }

    private void validateHandle(HttpServletRequest req, HttpServletResponse resp) throws IOException, URISyntaxException {
        ElementRepository repo = App.getRepository();
        URI reqURI = new URI(req.getRequestURI());
        String[] segs = reqURI.getPath().split("/");
        if(segs.length < 2 || segs.length > 3)
            new HttpResponse(HttpStatusCode.NotFound);
        String method = req.getMethod();
        if(!method.equals("GET"))
            new HttpResponse(HttpStatusCode.MethodNotAllowed);
        if (segs.length == 2){
            String code = segs[1];
            if(segs[1].contains("="))
                code = segs[1].substring(segs[1].indexOf("=") + 1);
            new ElementController().requestHandle(req, resp, repo.getByCode(code));
        }
        new HttpResponse(HttpStatusCode.NotFound);
    }
}
