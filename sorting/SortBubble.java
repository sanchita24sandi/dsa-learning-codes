
// import java.util.Arrays;
import java.util.*;

public class SortBubble {

    // public static void bubbleSort(int arr[]) {
    // for (int i = 0; i < arr.length - 1; i++) {
    // for (int j = 0; j < arr.length - 1 - i; j++) {
    // // swap
    // if (arr[j] > arr[j + 1]) {
    // int temp = arr[j];
    // arr[j] = arr[j + 1];
    // arr[j + 1] = temp;
    // }
    // }
    // }
    // }

    // public static void printArray(Integer arr[]) {
    // for (int i = 0; i < arr.length; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // public static void selectionSort(int arr[]) {
    //     for (int i = 0; i < arr.length - 1; i++) {
    //         int minPos = i;
    //         for (int j = i + 1; j < arr.length; j++) {
    //             // if(arr[minPos]>arr[j]){
    //             if (arr[minPos] < arr[j]) {
    //                 minPos = j;
    //             }
    //         }
    //         // swap
    //         int temp = arr[minPos];
    //         arr[minPos] = arr[i];
    //         arr[i] = temp;
        // }
    // }

    // public static void inesertionSort(int arr[]) {
    // for (int i = 1; i < arr.length; i++) {
    // int currentElement = arr[i];
    // int previousElement = i - 1;
    // // finding out the currect position
    // while (previousElement >= 0 && arr[previousElement] > currentElement) {
    // arr[previousElement + 1] = arr[previousElement];
    // previousElement--;
    // }
    // // insertion
    // arr[previousElement + 1] = currentElement;
    // }
    // }

   

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    public static void main(String bg[]) {
        int arr[] = { 2, 3, 1, 4, 6, 1, 5, 8 };
        // bubbleSort(arr);
       
        // inesertionSort(arr);
        // Arrays.sort(arr);
        // Arrays.sort(arr, 0,4);
        // Arrays.sort(arr,Collections.reverseOrder());
     
        printArray(arr);
    }

}