package program2;

public class SmallestInArray {

	public static void main(String args[]) {
		int a[] = { 44, 66, 99, 77, 33, 22, 55 };

		int temp;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
			System.out.println(a[0]);
		
	}
}