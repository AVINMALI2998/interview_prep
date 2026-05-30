package programs.arrays;

public class FindMinimum {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 500, 0, 9, 4, 3 };
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Smaller Number from this Array is " + min);
    }
}
