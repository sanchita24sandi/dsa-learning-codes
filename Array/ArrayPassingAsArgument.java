public class ArrayPassingAsArgument {
    public static void update(int marks[],int nonChangeable){
        nonChangeable=11;
        for (int i = 0; i < marks.length; i++) {
            marks[i]+=1;
        }

    }
    public static void main(String[] args) {
        int marks[]={ 97,98,99};
        int nonChangeable=10;
        update(marks,nonChangeable);
        System.out.println(nonChangeable);
        // print our marks
        for (int i = 0; i < marks.length; i++) {
           System.out.println(marks[i]+" ");
        }
        System.out.println();
    }
}
