public class InvertedHalfPyramid {
    // 12345
    // 1234
    // 123
    // 12
    // 1
    // inverted half-PyramidWith number
    public static void invertedHalfPyramidWithNumber(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        invertedHalfPyramidWithNumber(5);
    }
}
