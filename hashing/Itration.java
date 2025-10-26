import java.util.HashMap;
import java.util.Set;

public class Itration {
    public static void main(String[] args) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("India",2000);
        hm.put("China",2000);
        hm.put("Nepal",2000);
             hm.put("Indonesia",2000);
        hm.put("Uk",2500);
        System.out.println(hm);
        Set<String>keys=hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
           System.out.println("key = "+k+", Values = "+hm.get(k)); 
        }
    }
}
