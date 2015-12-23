package http;

import pt.isel.ls.common.Writable;

public interface HttpContent extends Writable {
    String getMediaType();    
}
