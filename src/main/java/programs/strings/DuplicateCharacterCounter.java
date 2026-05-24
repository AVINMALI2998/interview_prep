package programs.strings;

public class DuplicateCharacterCounter {
    public static void main(String[] args) {

        String str = "Avinash Mali Pune";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int count = 0;

            for (int j = 0; j < str.length(); j++) {
                if (ch == str.charAt(j)) {
                    count++;
                }
            }

            if (count > 1 && str.indexOf(ch) == i) {
                System.out.println(ch + " is repeated " + count + " times");
            }
        }

    }
}
