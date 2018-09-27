package Program;

import java.util.Arrays;

public class RemoveDuplicateCharfromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "qwqwdwfewfe";
		int[] temp = new int[6];

		int j = 0;
		char s1[] = s.toCharArray();
		Arrays.sort(s1);
		System.out.println(s1);
		int s2 = s.length();

		for (int i = 0; i < s2 - 1; i++) {
			if (s1[i] != s1[i + 1]) {
				temp[j++] = s1[i];
			}
		}
		temp[j++] = s1[s2 - 1];
		for (int i = 0; i < j; i++) {

			s1[i] = (char) temp[i];
			System.out.print(s1[i] + " ");

		}

	}

}
