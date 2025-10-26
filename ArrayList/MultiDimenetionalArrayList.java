import java.util.ArrayList;

public class MultiDimenetionalArrayList {
    public static void main(String[] args) {
        // create main list
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        // create list 1
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);
        // System.out.println(mainList);
        // create list 2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2);
        // System.out.println(mainList);
        // travse list main list
        for (int i = 0; i < mainList.size(); i++) {
            // create current list take the value of main list
            ArrayList<Integer> currlist = mainList.get(i);
            // traverse currList
            for (int j = 0; j < currlist.size(); j++) {
                // print the value of currlist
                System.out.print(currlist.get(j)+" ");
            }

            System.out.println();
        }
        System.out.println(mainList);

    }
}
