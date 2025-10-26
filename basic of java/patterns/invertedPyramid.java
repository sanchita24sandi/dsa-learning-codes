public class invertedPyramid {
    //     *
    //    **
    //   ***
    //  ****
    // *****
    // inverted pyramid
    public static void invertedRotatedPyramid(int n) {
        // outer loop=row
        for (int i = 1; i <= n; i++) {
            // inner loop
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");

            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        invertedRotatedPyramid(5);
    }
}
