package practice07;

public class Teacher extends Person {

    Klass teacherKlass;

    public Teacher(){}

    public Teacher (java.lang.String name, int age) {
        setName(name);
        setAge(age);
    }

    public Teacher (java.lang.String name, int age, Klass klass) {
        setName(name);
        setAge(age);
        setKlass(klass);
    }

    public void setKlass(Klass klass){
        teacherKlass = klass;
    }

    public Klass getKlass(){
        return teacherKlass;
    }

    public java.lang.String introduce(){
        if(teacherKlass == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }else{
            return super.introduce() + " I am a Teacher. I teach Class " + teacherKlass.getNumber() + ".";
        }
    }

    public String introduceWith(Student student){
        if(student.getKlass().getNumber() == this.getKlass().getNumber()){
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }
}