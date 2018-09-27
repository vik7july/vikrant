package Program;

public class EvenOdd {

	public static void main(String[] args) {
		int A[] = { 30, 44, 56, 67, 89, 34, 23 };
		evenOdd(A);
	}

	public static void evenOdd(int S[]) {
		int Length = S.length;
		int c=0; int s=0;
		for (int i = 0; i < Length; i++) {
			if (S[i] % 2 == 0) {
				c++;
				System.out.println("Even Number " + S[i]);
			} else {
				s++;
				System.out.println("Odd Number " + S[i]);

			}

		}
		System.out.println("Even Count"+c+" Odd Count"+s);

	}

}
