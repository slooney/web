import element.Element;
import element.ElementRepository;
import element.InMemoryElementRepository;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;

public class App {

    private static final int LISTEN_PORT = 8080;

    private static final ElementRepository _repo = new InMemoryElementRepository();
    public static ElementRepository getRepository(){
        return _repo;
    }

    public static void main(String[] args) throws Exception {

        _repo.add(new Element("slooney", "Ricardo", true));

        Server server = new Server(LISTEN_PORT);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        handler.addServletWithMapping(AppServlet.class, "/*");
        server.start();
        System.out.println("Server is started");

        server.join();
        System.out.println("Server is stopped, bye");
    }
}
