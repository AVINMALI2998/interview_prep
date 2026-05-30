package programs.general;

public class PrimeNo {

    public static void main(String[] args) {
        int x = 7;
        int temp = 0;

        for (int i = 2; i < x - 1; i++) {
            if (x % 2 == 0) {
                temp = temp + 1;
            }
        }

        if (temp == 0) {
            System.out.println(x + " is prime number");
        } else {
            System.out.println(x + " is not prime number");
        }
    }
}