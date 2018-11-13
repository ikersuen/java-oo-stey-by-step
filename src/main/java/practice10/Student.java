package practice10;

public class Student extends Person {

    Klass studentKlass;

    public Student(){}

    public Student (int id, java.lang.String name, int age, Klass klass) {
        setName(name);
        setAge(age);
        setId(id);
        setKlass(klass);
    }

    public void setKlass(Klass klass){
        studentKlass = klass;
    }

    public Klass getKlass(){
        return studentKlass;
    }

    public java.lang.String introduce(){
        if(this.equals(studentKlass.getLeader())){
            return super.introduce() + " I am a Student. I am Leader of Class " + studentKlass.getNumber() + ".";
        }else{
            return super.introduce() + " I am a Student. I am at Class " + studentKlass.getNumber() + ".";
        }
    }

    public Boolean isIn(Klass klass){
        if(this.studentKlass.equals(klass)){
            return true;
        }else{
            return false;
        }
    }
}