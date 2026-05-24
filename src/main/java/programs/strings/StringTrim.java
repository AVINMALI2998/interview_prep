package programs.strings;

public class StringTrim {

    public static void main(String[] args) {

        String removeSpace = "     Avinash Mali     ";
        int size = removeSpace.length();
        System.out.println("Length before trim " + size);

        String outPut = removeSpace.trim();

        System.out.println(outPut);
        System.out.println("Length after trim " + outPut.length());
    }
}
