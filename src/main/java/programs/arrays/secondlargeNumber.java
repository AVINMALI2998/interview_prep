package programs.arrays;

public class secondlargeNumber {

    public static void main(String[] args) {

        int[] arr = { 5, 8, 3, 99, 100, 200, 11, 22, 33, 44, 7 };
        int first = 0;
        int second = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > first) {
                second = first;
                first = arr[i];
            } else if (arr[i] > second && arr[i] != first) {
                second = arr[i];
            }
        }

        System.out.println("Second Largest: " + second);
    }
}
