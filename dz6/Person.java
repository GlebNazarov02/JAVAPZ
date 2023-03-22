package dz6;

import java.util.Objects;

public class Person {
    // public
    // protected (package + наследники)
    // default (package)
    // private

    private String name;
    private String second_name; // поле класса
    private int age;
    private String gender;    
    private int experience;

    // public Person(String name) {
        // this(name, 20);
//        this.name = name;
//        this.age = 20;
    // }

    public Person(String name,String second_name, int age,String gender,int experience) { // конструктор класса
        this.name = name;
        this.second_name = second_name;
        this.age = age;
        this.gender = gender;
        this.experience = experience;
    }

    public String getName() { 
        return name;
    }

    public String getSecondName() { 
        return second_name;
    }

    public String getGender() { 
        return gender;
    }

    public int getAge() {
        return age;
    }

    public int getExp() {
        return experience;
    }

   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        boolean objIsPerson = obj instanceof Person;
        if (!objIsPerson) {
            return false;
        }

        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name) && Objects.equals(second_name, anotherPerson.second_name) && age == anotherPerson.age && Objects.equals(gender, anotherPerson.gender) && experience == anotherPerson.experience;
    }

    @Override
    public int hashCode() {
        return age + experience;
    }

    public String isFam(Object obj){
        if (obj == null) {
            return "false";
        }
        boolean objIsPerson = obj instanceof Person;
        if (!objIsPerson) {
            return "false";
        }
        Person anotherPerson = (Person) obj;
        if(Objects.equals(second_name, anotherPerson.second_name)){
            return ("Родня");
        }
        return("не родня");
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %d", name,second_name, age,gender,experience);
    }

}
