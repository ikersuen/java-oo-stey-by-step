package practice03;

public class Worker extends Person{
    public Worker(java.lang.String name, int age){
        setName(name);
        setAge(age);
    }
    public java.lang.String introduce() {
        return "I am a Worker. I have a job.";
    }
}
