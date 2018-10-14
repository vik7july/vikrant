package program3;

public class SumofDigitinNumber {
	
	
	public static void main(String[] args) {
		int n = 2345;
		int s = 0;
		int r;
		while (n > 0) {
			r = n % 10;
			s = s + r;
			// s =s*10+r; for palindrome
			n = n / 10;
		}
		System.out.println(s);
		
	}
}