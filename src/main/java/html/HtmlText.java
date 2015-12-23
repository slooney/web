package html;

import org.apache.commons.lang.StringEscapeUtils;
import common.Writable;
import java.io.IOException;
import java.io.Writer;

public class HtmlText implements Writable {

    public final String _text;
    
    public HtmlText(String text) {
        _text = text;
    }

    @Override
    public void writeTo(Writer w) throws IOException {
        w.write(StringEscapeUtils.escapeHtml(_text));        
    }
}
