package practice08;

public class Klass {

    Integer klassNumber;
    Student leaderOfTheKlass;

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



    public void assignLeader(Student student){
        setLeader(student);
    }

    public void setLeader(Student student) {
        leaderOfTheKlass = student;
    }

    public Student getLeader(){
        return leaderOfTheKlass;
    }

}
