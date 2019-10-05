package Test;


import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class HashMapTest {
    public static void main(String[] args) {
        Map<Integer, String> m = new HashMap<>();
        Random r = new Random(36);
        Map<Integer, Integer> map = new HashMap<>();


        m.put(1,"Один");
        m.put(2,"Два");
        m.put(3,"Три");

//        System.out.println(m);
//
//        m.put(3,"Другое значение");
//
//        System.out.println(m);
//        System.out.println(m.get(1));

        //Выводим значения и ключи
        for (Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }

        //Выводим ключи
        for (Integer key : m.keySet()) {
            System.out.println("Key: " + key);
        }

        //Выводим значение
        for (String value : m.values()){
            System.out.println("Value: " + value);
        }

        //Генерим случайные числа и считаем кол-во совпадений
        for (int i = 0; i<=100; i++){
            int namber = r.nextInt(10);
            Integer fracvensy = map.get(namber);
            map.put(namber, fracvensy == null ? 1 : fracvensy + 1);
        }
        System.out.println(map);

    }
}
