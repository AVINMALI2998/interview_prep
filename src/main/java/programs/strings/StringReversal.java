package programs.strings;

/**
 * Reverses an entire string using StringBuilder
 * Example: "Avinash Mali" becomes "ilaM hsanivA"
 */
public class StringReversal {

    public static void main(String[] args) {
        String str = "Avinash Mali";

        StringBuilder rev = new StringBuilder(str).reverse();
        System.out.println(rev);
    }
}
