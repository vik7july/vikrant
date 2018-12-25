package Program;

public class StringPalindrome {

	public static void main(String args[]) {
		String original = "MADA";
		String reverse = ""; // Objects of String class
		// Scanner in = new Scanner(System.in);
		System.out.println(original);
		// original = in.nextLine();
		int length = original.length();
		for (int i = length - 1; i >= 0; i--)
			reverse = reverse + original.charAt(i);
		if (original.equals(reverse))
			System.out.println("Entered string/number is a palindrome " + reverse);
		else
			System.out.println("Entered string/number isn't a palindrome " + reverse);
	}
}