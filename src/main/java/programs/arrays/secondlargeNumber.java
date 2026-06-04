package programs.arrays;

public class secondlargeNumber {

    public static void main(String[] args) {

        int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 0 };

        int secmax = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] < arr[j]) {

                    secmax = arr[i];
                }

            }
        }
        System.out.println(secmax);
    }
}
