package programs.strings;

/**
 * String reversal program
 * Demonstrates string manipulation techniques
 */
public class ReverseString {

    public static void main(String[] args) {
        String str = "Avinash Mali";
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        System.out.println(rev);
    }
}
