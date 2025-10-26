public class ArrayLargestNumber {
    public static int getLargest(int number[]) {
        int smallest=Integer.MAX_VALUE;//+infinity
        int Largest = Integer.MIN_VALUE;// -infinity
        for (int i = 0; i < number.length; i++) {
            if (Largest < number[i]) {
                Largest = number[i];
            }
            if(smallest>number[i]){
                smallest=number[i];
            }
        }
        System.out.println("smallest value is : "+smallest);
        return Largest;
    }

    public static void main(String[] args) {
        int numbers[] = { -1, 2, 3, 5, 16, 4 };
        System.out.println("largest value is : "+getLargest(numbers));
    }
}
