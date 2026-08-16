package programs.general;

public class SwapNum {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b; // a now becomes 15
        b = a - b; // b becomes 5
        a = a - b; // a becomes 10

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
