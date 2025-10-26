public class NumberHalfPyramid {
    public static void main(String[] args) {
        // 1
        // 12
        // 123
        // 1234
        int n = 4;
        for (int line = 1; line <= n; line++) {
            // number print
            for (int num = 1; num <= line; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
