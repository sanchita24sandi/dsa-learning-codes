import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        // for (int i = 1; i <= n; i++) {// rows
        // for (int j = 0; j < n + i - 1; j++) {
        // if (j < n - i) {
        // System.out.print(" ");
        // // spaces
        // } else {// stars
        // System.out.print("*");
        // }
        // }
        // System.out.println();
        // }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
