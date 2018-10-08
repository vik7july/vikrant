package program3;

public class FindMaxofSumofindiviualNumberinArray {
	public static void main(String[] args) {
		
		int[] A = { 22, 35, 334, 44, 2, 87 };
		int s = 0;
		int r;
		int max = 0;
		for (int i = 0; i < A.length; i++) {
			int sum = 0;
			while (A[i] > 0) {
				r = A[i] % 10;
				sum = sum + r;
				A[i] = A[i] / 10;
			}
			if (sum > max) {
				max = sum;
			}
			System.out.println(sum);
		}
		System.out.println("Max is " + max);
	}
}