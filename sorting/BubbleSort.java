public class BubbleSort {
    public static void bubbleSort(int arr[], int n) {
        for (int i = n - 1; i >= 0; i--) {
            int didSwap = 0;
            for (int j = 0; j <= i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
            if (didSwap == 0) {
                break;
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
        bubbleSort(arr, n);
        printArray(arr, n);
    }
}
