package programs.arrays;

public class DuplicateIntegerInArray {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 10, 40, 50, 60, 50, 70, 20, 80, 90, 100 };

        int DuplicateValue = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {

                    DuplicateValue = arr[i];
                    System.out.println(DuplicateValue);
                }

            }
        }

    }
}
