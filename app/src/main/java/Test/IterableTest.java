package Test;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (int x: list) {
            System.out.println(x);
        }
        System.out.println();


        Iterator <Integer> it = list.iterator();
        int i=0;
        while (it.hasNext()){
            if (i==1){it.remove();}
            System.out.println(it.next());
            i++;
        }
        System.out.println(list);

    }
}
