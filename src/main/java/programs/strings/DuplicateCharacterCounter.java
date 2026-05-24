package programs.strings;

public class DuplicateCharacterCounter {
    public static void main(String[] args) {

        String str = "Avinash Mali Pune";
        char[] chr = str.toCharArray();
        boolean[] printed = new boolean[chr.length];

        for (int i = 0; i < chr.length; i++) {
            if (printed[i]) {
                continue;
            }

            int count = 0;
            for (int j = i; j < chr.length; j++) {
                if (chr[i] == chr[j]) {
                    count++;
                }
            }

            if (count > 1) {
                System.out.println(chr[i] + " is repeated " + count + " times");
            }
            printed[i] = true;
        }

    }
}
