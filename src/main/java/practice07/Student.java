package practice07;

public class Student extends Person {

    Klass studentKlass;

    public Student(){}

    public Student (java.lang.String name, int age, Klass klass) {
        setName(name);
        setAge(age);
        setKlass(klass);
    }

    public void setKlass(Klass klass){
        studentKlass = klass;
    }

    public Klass getKlass(){
        return studentKlass;
    }

    public java.lang.String introduce(){
        return super.introduce() + " I am a Student. I am at Class " + studentKlass.getNumber() + ".";
    }
}