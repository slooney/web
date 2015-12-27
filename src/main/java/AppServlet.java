import element.ElementController;
import element.ElementRepository;
import http.HttpResponse;
import http.HttpStatusCode;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AppServlet extends HttpServlet{
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        doMethod(req, resp);
    }

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws  IOException, ServletException{
        doMethod(req, resp);
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
//        if(segs.length < 2 || segs.length > 3)
//            new HttpResponse(HttpStatusCode.NotFound);
//        String method = req.getMethod();
//        if(!method.equals("GET"))
//            new HttpResponse(HttpStatusCode.MethodNotAllowed);
        if (segs.length == 2 || reqURI.getPath().equals("/")){
            new ElementController().requestHandle(req, resp, repo);
        }
    }
}
