public class InsertionSort {
    public static void insertionSort(int arr[], int n) {
        for (int i = 0; i < n - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
                System.out.println("run");

            }

        }
    }

    public static void printArray(int arr[], int n) {
        for (int i = 0; i <= n - 1; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n = arr.length;
        insertionSort(arr, n);
        printArray(arr, n);
    }
}
