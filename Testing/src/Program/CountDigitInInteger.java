package Program;

public class CountDigitInInteger {

	public static void main(String[] args) {
		int number = 3456789;
		System.out.println("Count " + countDigit(number));
	}

	public static int countDigit(int n) {
		int c = 0;
		while (n != 0) {
			n = n / 10;
			c++;
		}
		return (c);
	}
}