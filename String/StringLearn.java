import java.util.Scanner;

public class StringLearn {
    public static void printLetters(String fullName) {
        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }
    }

    public static void main(String[] args) {
        // char arr[] = { 'a', 'b', 'c', 'd' };
        // String str = "abcd";
        // String str2 = new String("xyz");
        // Scanner sc = new Scanner(System.in);

        // String name=sc.nextLine();
        // System.out.println(name);
        // String fullName="Bulti Gorai";
        // System.out.println(fullName.length());

        // Concatination
        String firstName = "Bulti";
        String lastName = "Bulti";
        String fullName = firstName + " " + lastName;
        // System.out.println(fullName);
        // System.out.println(fullName.charAt(0));

        printLetters(fullName);

    }
}
