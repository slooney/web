package element;

import http.HttpResponse;
import http.HttpStatusCode;

import javax.servlet.http.HttpServletRequest;

public class ElementController {

    private final ElementRepository repo;

    public ElementController(ElementRepository repo) {this.repo = repo;}

    public HttpResponse handleGetElementByCode(HttpServletRequest req, String code){
        Element e = repo.getByCode(code);
        if(e == null) return new HttpResponse(HttpStatusCode.NotFound);
        return new HttpResponse(HttpStatusCode.Ok, new ElementView(e));
    }
}
