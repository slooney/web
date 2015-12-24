package element;

import html.HtmlPage;

public class ElementView extends HtmlPage{

    public ElementView(Element e){
        super("Feliz Natal 2015!",
                h1(text("Neste natal...")),
                h3(text("Texto: " + e.toString()))
        );
    }

//    public ElemsView(Iterable<Element> list){
//        super("Elem list",
//                h1(text("Elem list")),
//                elemItems(list),
//                h1(text("Create new Elem")),
//                form("POST", "/todos",
//                        label("description","Description: "),
//                        textInput("description")
//                )
//        );
//    }
//
//    private static Writable elemItems(Iterable<Element> list) {
//        HtmlElem ul = new HtmlElem("ul");
//        for(Element elem : list){
//            ul.withContent(
//                    li(a(ResolveUrl.of(elem),elem.toString()))
//            );
//        }
//        return ul;
//    }
}
