import java.util.HashMap;

public class CreateHashMap {
    public static void main(String[] args) {
        // Craete
        HashMap<String, Integer> hm = new HashMap<>();

        // Insert-O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("uS", 50);
        System.out.println(hm);

        // // get-O(1)
        // int population = hm.get("India");
        // System.out.println(population);

        // int population1 = hm.get("UNk");
        // System.out.println(population1);

        // // ContainsKye-O(1)
        // System.out.println(hm.containsKey("India"));
        // System.out.println(hm.containsKey("up"));

        // // Remove -O(1)
        // System.out.println(hm.remove("China"));//150
        // System.out.println(hm.remove("UK"));//null

        // // size-O()
        // System.out.println(hm.size());
        // hm.clear();
        // System.out.println(hm.isEmpty());
    }
}
