import java.util.LinkedHashSet;

public class LinkedHashSetProgram {
    public static void main(String[] args) {
         LinkedHashSet<String>lhs=new LinkedHashSet<>();
lhs.add("Delhi");
lhs.add("Mumbai");
lhs.add("Noida");
lhs.add("Kolkata");
lhs.add("Bengaluru");
lhs.add("panjab");
lhs.add("noihati");
System.out.println(lhs);
lhs.remove("Delhi");
System.out.print(lhs);
    }
}
