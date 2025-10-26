public class SelectionSort {

     public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int mini = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[mini]) {
                    mini = j;
                }
                // swap
                int temp = arr[mini];
                arr[mini] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }
    public static void main(String[] args) {
         int arr[] = { 2, 3, 1, 4, 6, 1, 5, 8 };
        selectionSort(arr);
        printArray(arr);
    }
}
