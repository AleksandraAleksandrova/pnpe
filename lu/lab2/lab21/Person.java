package lab21;

public class Person {
    private String name;
    private String egn;
    private String bday;

    public Person(){
        this.name = "";
        this.egn = "";
        this.bday = "";
    }

    public Person(String name, String egn, String bday) {
        this.name = name;
        this.egn = egn;
        this.bday = bday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEgn() {
        return egn;
    }

    public void setEgn(String egn) {
        this.egn = egn;
    }

    public String getBday() {
        return bday;
    }

    public void setBday(String bday) {
        this.bday = bday;
    }
}
