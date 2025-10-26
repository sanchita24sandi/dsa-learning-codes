public class DimondShape {
   
//     *
//    ***
//   *****
//  *******
// *********
// *********
//  *******
//   *****
//    ***
//     *
   
  
    // dimond shape
    public static void dimond(int n) {
        // 1st half
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2st half
        // outer loop
        for (int i = n; i >= 1; i--) {
            // inner loop
            // space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // for stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       
        dimond(5);
    }
}
