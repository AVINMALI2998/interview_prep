package programs.general;

public class PrintPrimeNumbers {
    public static void main(String[] args) {
        int x = 100;

        for (int i = 2; i < x - 1; i++) {
            int temp = 0;
            for (int j = 2; j < i - 1; j++) {
                if (i % j == 0) {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {
                System.out.println(i);
            }
        }
    }
}
