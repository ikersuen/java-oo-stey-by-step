package practice02;

public class Student extends Person {

    int studentKlass;

    public Student(){}

    public Student (java.lang.String name, int age, int klass) {
        setName(name);
        setAge(age);
        setKlass(klass);
    }

    public void setKlass(int klass) {
        studentKlass = klass;
    }

    public int getKlass() {
        return studentKlass;
    }

    public java.lang.String introduce(){
        return "I am a Student. I am at Class " + getKlass() + ".";
    }
}

