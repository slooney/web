package element;

public class Element {
    private String name;
    public String getName() {return name;}
    public void setName(String name){this.name = name;}

    private boolean gender;
    public boolean getGender() {return gender;}
    public void setGender(boolean gender){this.gender= gender;}

    private String code;
    public String getCode() {return code;}
    public void setCode(String code) {this.code = code;}

    public Element(String code, String name, boolean gender){
        this.code = code;
        this.name = name;
        this.gender = gender;
    }

    @Override
    public String toString(){
        return String.format("Este Natal h� um grande presente no sapatinho! " +
                        "Ol� ti" + (gender ? "o" : "a") + " %s", name);
    }
}
