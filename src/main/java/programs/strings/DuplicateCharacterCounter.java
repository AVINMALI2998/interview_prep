package programs.strings;

public class DuplicateCharacterCounter {
    public static void main(String[] args) {

        String str = "Avinash Mali TCS";
        char[] chr = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chr.length; i++) {

            for (int j = i + 1; j < chr.length; j++) {
                if (chr[i] == chr[j]) {
                    System.out.println(chr[i]);
                    count++;
                }
            }
        }
        System.out.println("repeted character count is " + count);

    }
}
