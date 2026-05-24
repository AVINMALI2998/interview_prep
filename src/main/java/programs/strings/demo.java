package programs.strings;

public class demo {

    public static void main(String[] args) {
        String str = "Avinash Mali Java";
        String substr = "Java";

        if (str.contains(substr)) {
            System.out.println("Sub string found");
        } else {
            System.out.println("Sub string not found");
        }
    }
}
