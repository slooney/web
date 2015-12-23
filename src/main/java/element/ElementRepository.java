package element;

public interface ElementRepository {
    public Iterable<Element> getAll();
    public Element getByCode(String code);
    public void add(Element e);
    public boolean remove(String name);
}
