import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Enter the indenumber of array
        int n = sc.nextInt();
        int arr[] = new int[n];

        // Enter the values in the array
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // precompute /HASHING
        // create an hash array
        int hash[] = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        // ask q for frequence
        int q=sc.nextInt();
        while (q--!=0) {
            int num=sc.nextInt();
            // fetching
            System.out.println(hash[num]);
            
        }
    }
}