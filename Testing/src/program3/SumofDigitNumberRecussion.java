/*package program3;

public class SumofDigitNumberRecussion {
	int  sum=0;
	public int sumdigit(int n) {
		int r;
		
		while (n > 0) {
			r = n % 10;
			sum += r;
			return sumdigit(n / 10);

		}
		//System.out.println(sum);
		return sum;

	}

	public static void main(String[] args) {
		int number = 234567;

		int s= sumdigit(number);
		System.out.println(s);
	}

}
*/