package practice06;

public class Teacher extends Person {

    Integer teacherKlass;

    public Teacher(){}

    public Teacher (java.lang.String name, int age) {
        setName(name);
        setAge(age);
    }

    public Teacher (java.lang.String name, int age, Integer klass) {
        setName(name);
        setAge(age);
        setKlass(klass);
    }

    public void setKlass(Integer klass) {
        teacherKlass = klass;
    }

    public Integer getKlass() {
        return teacherKlass;
    }

    public java.lang.String introduce(){
        if(getKlass() == null){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }else{
            return super.introduce() + " I am a Teacher. I teach Class " + getKlass() + ".";
        }
    }
}