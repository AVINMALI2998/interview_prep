package programs.strings;

/**
 * Reverses each word in a given string
 * Example: "Avinash Mali" becomes "hsanivA ilaM"
 */
public class ReverseWords {

    public static void main(String[] args) {
        String str = "Avinash Mali working for Capgemini";
        String[] words = str.split(" ");

        for (String word : words) {
            String rev = "";

            for (int i = word.length() - 1; i >= 0; i--) {
                rev = rev + word.charAt(i);
            }
            System.out.print(rev + " ");
        }
    }

}
