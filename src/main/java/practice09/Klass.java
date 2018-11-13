package practice09;

public class Klass {

    Integer klassNumber;
    Student leaderOfTheKlass;
    Student studentInTheKlass;

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
        if (this.studentInTheKlass != null){
            setLeader(student);
        }else{
            System.out.print("It is not one of us.\n");
        }
    }

    public void setLeader(Student student) {
        leaderOfTheKlass = student;
    }

    public Student getLeader(){
        return leaderOfTheKlass;
    }

    public void appendMember (Student student){
        this.studentInTheKlass = student;
    }

}
