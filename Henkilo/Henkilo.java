package Henkilo;
public class Henkilo implements Nimeva{
    private String name;
    public Henkilo (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String toString(){
        return name;
    }
}