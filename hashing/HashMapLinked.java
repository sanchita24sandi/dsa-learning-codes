import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.TreeMap;

public class HashMapLinked {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("India", 100);
        lhm.put("China", 5);
        lhm.put("Us", 50);
        System.out.println(lhm);
        TreeMap<String, Integer> thm = new TreeMap<>();
        thm.put("India", 100);
        thm.put("China", 5);
        thm.put("Us", 50);
        System.out.println(thm);
        
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 100);
        hm.put("China", 5);
        hm.put("Us", 50);
        System.out.println(hm);
    }
}
