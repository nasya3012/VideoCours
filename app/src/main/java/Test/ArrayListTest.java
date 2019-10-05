package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i<10; i++){
            list.add(i);

        }
        System.out.println(list.get(0));
        System.out.println(list.get(9));
        System.out.println(list.size());

        for(int i= 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        for (Integer x: list){
            System.out.print(x);
        }

        list.remove(5);
        System.out.print(list);


        ArrayList<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        String[] daysArray = new String[days.size()];

        for (int i = 0; i < days.size(); i++) {
            daysArray[i] = days.get(i);
        }

        System.out.println("Массив: " + Arrays.toString(daysArray));
    }


}
