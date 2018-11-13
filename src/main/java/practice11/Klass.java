package practice11;

public class Klass {

    Integer klassNumber;
    Student leaderOfTheKlass;
    Student studentInTheKlass;
    Teacher klassTeacher;

    public Teacher getKlassTeacher() {
        return klassTeacher;
    }

    public void setKlassTeacher(Teacher klassTeacher) {
        this.klassTeacher = klassTeacher;
    }

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
            if(this.getKlassTeacher() != null) {
                System.out.print("I am " + this.getKlassTeacher().getName() + ". I know " + student.getName() + " become Leader of " + student.getKlass().getDisplayName() + ".\n");
            }
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
        student.setKlass(this);
        this.studentInTheKlass = student;
        if(this.getKlassTeacher() != null) {
            System.out.print("I am " + this.getKlassTeacher().getName() + ". I know " + student.getName() + " has joined " + student.getKlass().getDisplayName() + ".\n");
        }
    }
}
