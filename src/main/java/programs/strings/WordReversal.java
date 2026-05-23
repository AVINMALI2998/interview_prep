package programs.strings;

public class WordReversal {
	public static void main(String[] args) {
		String str = "Avinash Mali";
		System.out.println(str);
		String[] words = str.split(" ");
		String rev = words[1] + " " + words[0];

		System.out.println(rev);

	}
}
