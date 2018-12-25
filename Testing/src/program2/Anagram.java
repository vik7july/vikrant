package program2;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "abce";
		String s2 = "bcez";
		int l1 = s1.length();
		int l2 = s2.length();
		if (l1 == l2) {
			int l3 = l1;
			int f = 0;
			int f1 = 0;
			for (int i = 0; i < l3; i++) {

				for (int j = 0; j < l3; j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						f = 1;
						break;
					}
				}
				if (f == 0) {
					f1 = 1;
					break;
				}

			}
			if (f1 == 1) {
				System.out.print("Strings are not Anagram to Each Other..!!");
			} else {
				System.out.print("Strings are Anagram");
			}
		} else {
			System.out.print("Both Strings Must have the same number of Character to be an Anagram");
		}
	}
}