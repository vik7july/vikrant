package program3;

public class FindMinDiffofindiviualNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { 71, 66, 74, 98, 28 };

		int r = 0;
		int min = 9;
		for (int i = 0; i < A.length; i++) {
			int diff = 0;
			while (A[i] > 0) {
				r = A[i] % 10;
				diff = r - diff;
				A[i] = A[i] / 10;
			}
			if (min > diff) {
				min = diff;
			}
			System.out.println("Difference "+diff);
		}
		System.out.println("Min difference "+min);

	}

}
