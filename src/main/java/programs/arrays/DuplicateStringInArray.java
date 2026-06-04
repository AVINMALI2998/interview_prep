package programs.arrays;

public class DuplicateStringInArray {

    public static void main(String[] args) {

        String arr[] = { "avinash", "mali", "avinash", "mali", "pethsangvi", "pune" };

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    System.out.println(arr[i]);
                }

            }
        }

    }
}
