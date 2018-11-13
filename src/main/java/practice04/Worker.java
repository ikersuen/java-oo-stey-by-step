package practice04;

public class Worker extends Person{
    public Worker(java.lang.String name, int age){
        setName(name);
        setAge(age);
    }
    public java.lang.String introduce() {
        return backIntroduce() + " I am a Worker. I have a job.";
    }
}
