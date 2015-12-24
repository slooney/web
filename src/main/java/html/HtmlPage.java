package html;

import common.Writable;

public class HtmlPage extends Html {

    public HtmlPage(String title, Writable... c) {
        super(
                new HtmlElem("html lang=\"PT-pt\"" ,
                        new HtmlElem("head",
                                //new HtmlElem("meta", ),
                                //new HtmlElem("meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\""),
                                //new HtmlElem("meta name=\"viewport\" content=\"width=device-width, initial-scale=1\""),
                                new HtmlElem("Title", new HtmlText(title))),
                        new HtmlElem("body", c)
                )
        );
    }
}
