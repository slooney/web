package element;

import java.util.HashMap;
import java.util.Map;

public class InMemoryElementRepository implements ElementRepository{

    private final Map<String, Element> _map = new HashMap<String, Element>();

    public Iterable<Element> getAll(){
        return _map.values();
    }

    public Element getByCode(String code) {
        return _map.get(code);
    }

    public void add(Element e) {
        _map.put(e.getCode(), e);
    }

    public boolean remove(String code) {
        return _map.remove(code) != null;
    }
}
