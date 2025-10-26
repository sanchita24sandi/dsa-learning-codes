public class ArrayBinarySearch {

    // binary search code
    public static int binarSearch(int arr[], int key) {
        int start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;

            // comariisons
            if (arr[mid] == key) {// found
                return mid;
            } else if (arr[mid] < key) {// right
                start = mid + 1;
            } else {// left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 4, 6, 8, 10, 12, 14 };
        int key = 14;
        System.out.println(binarSearch(arr, key));
    }
}
