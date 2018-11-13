package practice07;

public class Klass {

    Integer klassNumber;

    public Klass() {

    }

    public Klass(Integer number){
        setKlass(number);
    }

    public void setKlass(Integer number) {
        klassNumber = number;
    }

    public Integer getNumber() {
        return klassNumber;
    }

    public String getDisplayName(){
        return "Class " + getNumber();
    }
}
