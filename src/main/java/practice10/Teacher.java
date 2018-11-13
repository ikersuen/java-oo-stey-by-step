package practice10;

import java.util.LinkedList;

public class Teacher extends Person {

    LinkedList<Klass> classes;

    public Teacher(){}

    public Teacher (int id, java.lang.String name, int age) {
        setId(id);
        setName(name);
        setAge(age);
    }

    public LinkedList<Klass> getClasses() {
        return classes;
    }

    public void setClasses(LinkedList<Klass> classes) {
        this.classes = classes;
    }

    public Teacher (int id, java.lang.String name, int age, LinkedList<Klass> classes) {
        setId(id);
        setName(name);
        setAge(age);
        setClasses(classes);
    }

    public String introduce(){
        if(classes == null || classes.size() == 0){
            return super.introduce() + " I am a Teacher. I teach No Class.";
        }else{
            String allClassesIncluded = "";
            for( int i = 0; i < classes.size(); i++){
                if( i != 0 ){
                    allClassesIncluded += ", ";
                }
                allClassesIncluded += classes.get(i).getNumber();
            }
            return super.introduce() + " I am a Teacher. I teach Class " + allClassesIncluded + ".";
        }
    }

    public String introduceWith(Student student){
        if(isTeaching(student)){
            return super.introduce() + " I am a Teacher. I teach " + student.getName() + ".";
        }else{
            return super.introduce() + " I am a Teacher. I don't teach " + student.getName() + ".";
        }
    }

    public Boolean isTeaching (Student student){
        if(classes.contains(student.getKlass())){
            return true;
        }else{
            return false;
        }
    }
}