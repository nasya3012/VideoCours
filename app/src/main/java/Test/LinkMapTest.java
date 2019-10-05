package Test;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class LinkMapTest {
    public static void main(String[] args) {
        Map<Integer, String> hm = new HashMap<>();  //внутри не гарантируется никакого порядка
        Map<Integer, String> lhm = new LinkedHashMap<>(); //получаются в том же виде, в котором были добавлены
        Map<Integer, String> tm = new TreeMap<>();  //будут отсортированы по ключу(естественный порядок)
        testMap(hm);
        testMap(lhm);
        testMap(tm);
    }

    public static void testMap(Map<Integer, String> map){
        map.put(56, "Conya");
        map.put(14, "Katya");
        map.put(0, "Valya");
        map.put(10000, "Rita");
        map.put(66, "Nadya");
        map.put(-77, "Yana");
        for (Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey()+ " : " + entry.getValue());
        }
        System.out.println();
    }
}
