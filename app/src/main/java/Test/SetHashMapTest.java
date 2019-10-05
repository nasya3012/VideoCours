package Test;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Random;
import java.util.Set;

public class SetHashMapTest {
    public static void main(String[] args) {
        Map<Person, String> m = new HashMap<>();
        Set<Person> s = new HashSet<>();

        Person person1 = new Person(1, "Ivan");
        Person person2 = new Person(1, "Ivan");

        m.put(person1, "ddddd");
        m.put(person2, "ddddd");

        s.add(person1);
        s.add(person2);

        System.out.println(m);
        System.out.println(s);


    }
}
class Person{

    private int id;
    private String name;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String toString(){
        return "Person " + "id "+ id + " name "+ name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name);
    }

    // обьект преобразовуется в целое число
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}