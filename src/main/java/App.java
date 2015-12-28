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

        _repo.add(new Element("dloilp5t", "Lula", true));
        _repo.add(new Element("zgrfwk92", "&Eacute;lsio", true));
        _repo.add(new Element("wgbwmrhy", "Cl&aacute;udio", true));
        _repo.add(new Element("nkdqgoi3", "F&aacute;bio", true));
        _repo.add(new Element("xxmm8zlj", "Vanessa", false));
        _repo.add(new Element("v9tf49vd", "Cl&aacute;udia", false));
        _repo.add(new Element("y43azx4d", "Niza", true));
        _repo.add(new Element("akjaf5em", "Marcos", true));
        _repo.add(new Element("jvuswhyd", "Mike", true));
        _repo.add(new Element("c7pxhotx", "V&acirc;nia", false));
        _repo.add(new Element("94mn0any", "M&aacute;rio", true));
        _repo.add(new Element("flkg3zus", "Nuno", true));
        _repo.add(new Element("di9f9fy3", "C&aacute;tia", false));
        _repo.add(new Element("whnh6pvt", "C&aacute;tia", false));
        _repo.add(new Element("m51km6kw", "Rita", false));
        _repo.add(new Element("dtbwjdt4", "Ritinha", false));
        _repo.add(new Element("xiivsq18", "S&iacute;lvia", false));
        _repo.add(new Element("8ci55izr", "Jorge", true));
        _repo.add(new Element("n2giy7tq", "Filipa", false));
        _repo.add(new Element("49b010l3", "V&iacute;tor", true));
        _repo.add(new Element("jy5v98ii", "Joana", false));
        _repo.add(new Element("httuxlej", "Pedro", true));
        _repo.add(new Element("8zgxjype", "Sandra", false));
        _repo.add(new Element("5mu3mlxn", "Paulo", true));
        _repo.add(new Element("dfjn5h3l", "Lu&iacute;s", true));
        _repo.add(new Element("k1ng273t", "Alfredo", true));
        _repo.add(new Element("dy8dgl70", "Rute", false));
        _repo.add(new Element("xj6orm8j", "Jo&atilde;o", true));
        _repo.add(new Element("uti11f1c", "Patr&iacute;cia", false));
        _repo.add(new Element("6utnnhrp", "M&aacute;rcia", false));
        _repo.add(new Element("c9no3zxa", "Ana", false));
        _repo.add(new Element("mxzla7ml", "Am&acirc;ndio", true));
        _repo.add(new Element("llokuv52", "Raquel", false));
        _repo.add(new Element("2xl69o81", "Manuela", false));
        _repo.add(new Element("7zpus574", "Leonel", true));
        _repo.add(new Element("arl842kn", "In&ecirc;s", false));
        _repo.add(new Element("kt8u6xn3", "Fred", true));
        _repo.add(new Element("er408kox", "Lara", false));
        _repo.add(new Element("idsmwzdd", "Patr&iacute;cia", false));
        _repo.add(new Element("q9237om5", "Ana", false));
        _repo.add(new Element("7r4tt5fe", "Ana Isabel", false));
        _repo.add(new Element("kxujyo72", "Rita", false));
        _repo.add(new Element("5jwzbhwk", "Joana", false));
        _repo.add(new Element("3ew9rcrz", "B&aacute;rbara", false));
        _repo.add(new Element("h4fsg0rx", "Cl&aacute;udia", false));
        _repo.add(new Element("69i7m954", "Katy", false));
        _repo.add(new Element("2wpmqcsc", "Miguel", true));
        _repo.add(new Element("eji85owt", "Diana", false));

        Server server = new Server(Integer.valueOf(System.getenv("PORT")));
        //Server server = new Server(LISTEN_PORT);
        ServletHandler handler = new ServletHandler();
        server.setHandler(handler);
        handler.addServletWithMapping(AppServlet.class, "/*");
        server.start();
        System.out.println("Server is started");

        server.join();
        System.out.println("Server is stopped, bye");
    }
}
