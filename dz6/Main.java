package dz6;

import java.io.IOException;
import java.util.*;


public class Main{


    public static void findOldestPersons(List<Person> persons) {
        ArrayList<Person> olderpers = new ArrayList<Person>();
        for (Person p : persons) {
            if (p.getAge() > 25) {
                olderpers.add(p);
            }
        
        }
        System.out.println(olderpers);
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        serializable();
        Person pers1 = new Person("Ivan", "Persikov",50,"male",3);
        Person pers2 = new Person("Andrew","Vasin", 45,"male",4);
        Person pers3 = new Person("Igor", "Voitenko",24,"male",1);
        Person pers5 = new Person("Igor", "Voitenko",24,"male",1);


        ArrayList<Person> persons = new ArrayList<Person>();
        persons.add(pers1);
        persons.add(pers2);
        persons.add(pers3);

        System.out.println(persons);
        System.out.println(pers3.equals(pers5));
        System.out.println(pers3.hashCode()==pers2.hashCode());
        System.out.println(pers3.isFam(pers2));
        findOldestPersons(persons);
    }


}

