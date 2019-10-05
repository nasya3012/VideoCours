package Test;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        Set<Integer> hs = new HashSet<>();
        Set<Integer> hs1 = new HashSet<>();
        Set<String> lhs = new LinkedHashSet<>();
        Set<String> ts = new TreeSet<>();

        hs.add(0);
        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(5);
        hs.add(6);

        hs1.add(3);
        hs1.add(4);
        hs1.add(5);
        hs1.add(6);
        hs1.add(7);
        hs1.add(8);
        hs1.add(9);

        // union   обьеденение
        Set<Integer> union = new HashSet<>(hs);
        union.addAll(hs1);
        System.out.println(union);

        // intersection  пересечение множеств
        Set<Integer> intersection = new HashSet<>(hs);
        intersection.retainAll(hs1);
        System.out.println(intersection);

        // difference разность множеств
        Set<Integer> difference = new HashSet<>(hs);
        difference.removeAll(hs1);
        System.out.println(difference);



//        for (String name : lhs){
//            System.out.println(name);
//        }
//
//        boolean b = hs.contains("Tom");
//        System.out.println(b);
//
//        System.out.println(hs.contains("I"));

    }
}
