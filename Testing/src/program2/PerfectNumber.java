package program2;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 6;
		int sum = 0;
		for (int i = 1; i < number; i++) {
			if (number % i == 0) {
				sum += i;
			}
		}
		if (number == sum)
			System.out.println("It is Perfect Number: " + sum);
		else
			System.out.println("Not a Perfect Number: " + sum);

	}

}