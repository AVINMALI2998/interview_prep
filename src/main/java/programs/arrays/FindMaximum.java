package programs.arrays;

public class FindMaximum {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 500, 0, 9, 4, 3 };
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Larger Number from this Array is " + max);
    }
}
