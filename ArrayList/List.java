import java.util.ArrayList;

public class List {

    public static void main(String[] args) {
        // create array list
        ArrayList<Integer> list = new ArrayList<>();
        // list.add(1);//O(1)
        // list.add(2);
        // list.add(3);
        // list.add(4);
        // list.add(4);
        // list.add(1,9);//O(n)
        // System.out.println(list);
        // // get Opertation=O(1)
        // int element=list.get(2);
        // System.out.println(element);
        // // Delete
        // list.remove(2);
        // System.out.println(list);
        // // set
        // list.set(2,10);
        // System.out.println(list);
        // // contain
        // System.out.println((list.contains((1))));
        // System.out.println((list.contains((11))));
        System.out.println(list.size());
        // print the array list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
        System.out.println();
        for (int i = list.size()-1; i>=0; i--) {
            System.out.print(list.get(i));
        }
    }
}