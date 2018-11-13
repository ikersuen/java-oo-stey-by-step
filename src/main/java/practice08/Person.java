package practice08;

import java.util.Objects;

public class Person {
   private int personAge;
   private String personName;
   private int personId;

    public Person(){}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return personId == person.personId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(personId);
    }

    public Person (int id, String name, int age) {
        this.personId = id;
        this.personName = name;
        this.personAge = age;
    }

    public void setId(int id) { this.personId = id;  }

    public int getId() { return personId; }

    public void setAge(int age){
        this.personAge = age;
    }

    public int getAge(){
        return personAge;
    }

    public void setName(java.lang.String name){
        this.personName = name;
    }

    public String getName(){
        return personName;
    }

    public String backIntroduce() {return "My name is " + getName() + ". I am " + getAge() + " years old."; }

    public String introduce(){
        return backIntroduce();
    }
}
