package practice07;

public class Person {
    int personAge;
    java.lang.String personName;

    public Person(){}

    public Person (java.lang.String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setAge(int age){
        personAge = age;
    }

    public int getAge(){
        return personAge;
    }

    public void setName(java.lang.String name){
        personName = name;
    }

    public java.lang.String getName(){
        return personName;
    }

    public java.lang.String backIntroduce() {return "My name is " + getName() + ". I am " + getAge() + " years old."; }

    public java.lang.String introduce(){
        return backIntroduce();
    }
}
