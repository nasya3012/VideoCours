package Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SortirovkaListTest {
    public static void main(String[] args) {

        List <String> animals = new ArrayList<>();

        animals.add("Cat");
        animals.add("Frog");
        animals.add("Dog");
        animals.add("A");
        animals.add("Chiken");

        Collections.sort(animals, new StringLengsComporate());
        System.out.println(animals);

        List <Integer> namber = new ArrayList<>();

        namber.add(18);
        namber.add(-3);
        namber.add(100);
        namber.add(0);
        namber.add(18);

        Collections.sort(namber, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1 > o2) {
                    return -1;
                } else if (o1 < o2) {
                    return 1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println(namber);

        List<Persons> people = new ArrayList<>();
        people.add(new Persons(1, "Petr"));
        people.add(new Persons(110, "Viva"));
        people.add(new Persons(8, "Eva"));

        Collections.sort(people, new Comparator<Persons>() {
            @Override
            public int compare(Persons o1, Persons o2) {
                if (o1.getId() < o2.getId()){
                    return 1;
                }else  if (o1.getId()>o2.getId()){
                    return -1;
                }else {return 0;}
            }
        });
        System.out.println(people);
        System.out.println();

        List<Mammals> mammalsList = new ArrayList<>();
        Set<Mammals> mammalsSet = new TreeSet<>();

        addElements(mammalsList);
        addElements(mammalsSet);

        Collections.sort(mammalsList);

        System.out.println(mammalsList);
        System.out.println(mammalsSet);

    }

    private static void addElements(Collection collection){
        collection.add(new Mammals(1,"JJJJJJ"));
        collection.add(new Mammals(15,"PPPPPP"));
        collection.add(new Mammals(-13,"WWWWW"));
        collection.add(new Mammals(10,"VVVVVVV"));
        collection.add(new Mammals(100,"NNNNNNN"));
    }

}

class StringLengsComporate implements Comparator <String> {

    @Override
    public int compare(String o1, String o2) {
        if (o1.length() < o2.length()) {
            return 1;
        } else if (o1.length() > o2.length()) {
            return -1;
        } else {
            return 0;

        }
    }
}

class Persons {
    int id;
    String name;

    public Persons(int id, String name){
        this.id =id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
}

class Mammals implements Comparable <Mammals>{

    private  int id;
    private String name;

    public int getId() {
        return id;
    }

    public Mammals(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mammals mammals = (Mammals) o;
        return id == mammals.id &&
                Objects.equals(name, mammals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Mammals{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Mammals o) {
        if (this.id > o.getId()){
            return 1;
        } else if (this.id < o.getId()) {
            return -1;
        } else {return 0;
        }
    }
}


