import java.util.*;

public class Isprime {
    public static boolean isPrime(int x) {
        boolean isPrimeNum = true;
        if (x == 2) {
            return isPrimeNum;
        }
        for (int i = 2; i  <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                isPrimeNum = false;
                return isPrimeNum;
            }
        }
        return isPrimeNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take value of n
        System.out.println("Enter the amount of inputs check prime or not");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            System.out.println("is prime : " + isPrime(x));
        }
    }
}
