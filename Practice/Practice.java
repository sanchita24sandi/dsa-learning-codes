public class Practice {

    // // pattern1

    static void pattern1(int n){
        for (int i = 0; i < n; i++) {
        for (char j = (char)('e'-i); j <= 'e'; j++) {
        System.out.print(j + " ");
        }
        System.out.println();
        }
    }

    // pattern 2
    static void pattern2(int n){
        int intSpace = 0;
        for (int i = 0; i < n; i++) {

            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < intSpace; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*");

            }
            intSpace += 2;
            System.out.println();
        }
        intSpace=8;

        for (int i = 1; i <= n; i++) {

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < intSpace; j++) {
                System.out.print(" ");
            }

            // star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");

            }
            intSpace -= 2;
            System.out.println();
        }

    }

    static void pattern3(int n){
        // start
        for (int i = 1; i <=n; i++) {
            // star
            for (int j = 1; j<i; j++) {
                System.out.print("*");
            }
            // System.out.println();

            // spaces
            for (int j = 0; j <2*(n-1); j++) {
                System.out.print(" ");
            }
            // star
             for (int j = 1; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

        // pattern1(4);

        // pattern2(5);
        pattern3(5);
       
    }
}
