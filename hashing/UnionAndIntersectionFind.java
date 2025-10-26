import java.util.HashSet;
public class UnionAndIntersectionFind {
    public static void main(String[] args) {
        int arr1[]={7,3,9};
        int arr2[]={6,3,9,2,4};
        HashSet<Integer>set=new HashSet<>();
        // union
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        System.out.println(set.size());



        // **********Intersection**********
        set.clear();
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            
            if(set.contains(arr2[i])){
count++;
set.remove(arr2[i]);
            }
        }
        System.out.println("intersection"+count);

    }
}
