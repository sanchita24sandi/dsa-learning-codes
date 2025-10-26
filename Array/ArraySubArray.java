public class ArraySubArray {

    // find sub Array
    public static void subArray(int numbers[]) {
        int ts = 0;
        int min_sum = Integer.MIN_VALUE;
        int max_sum = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            int start = i;

            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0;

                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k];
                }

               
                System.out.println("\n sum of sub array : " + sum);
                ts++;
                System.out.println();
            }
            System.out.println();
            System.out.println();
        }
        System.out.println("total sub Array = " + ts);
        System.out.println("min sum = " + min_sum);
        System.out.println("max sum = " + max_sum);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 20 };
        subArray(numbers);
    }
}
