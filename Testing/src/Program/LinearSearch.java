package Program;

public class LinearSearch {
	public static void main(String[] args) {
		int A[] = { 10, 20, 40, 56, 32, 67 };
		int Key = 56;

		System.out.println(Key + "found at Index" + linearSearch(A, Key));
	}

	public static int linearSearch(int Arr[], int k) {
		int Length = Arr.length;

		for (int i = 0; i < Length; i++) {
			if (Arr[i] == k) {
				return i;
			}
		}
		return 0;

	}

}
