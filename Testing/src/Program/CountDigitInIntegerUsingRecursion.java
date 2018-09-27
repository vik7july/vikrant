package Program;

public class CountDigitInIntegerUsingRecursion {
	public static void main(String []args)
	{
		int number=543;
		System.out.println("Count "+countDigit(number));
		}
	public static int countDigit(int n) {
		if(n==0) {
			return 0;
			}
		else{
			return 1+ countDigit(n/10);
		}
		}
}