package programs.arrays;

public class SumOfArray {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 500, 0, 9, 4, 3 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of this Array is " + sum);
    }
}
