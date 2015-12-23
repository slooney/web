package element;

import html.HtmlPage;

public class ElementView extends HtmlPage{

    public ElementView(Element e){
        super("Feliz Natal 2015!",
                h1(text("Neste natal...")),
                h3(text("Texto: " + e.toString()))
        );
    }
}
