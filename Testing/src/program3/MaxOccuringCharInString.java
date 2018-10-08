package program3;

import java.util.HashMap;

public class MaxOccuringCharInString {
	public static Character findMaxOChar(String text) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Character maxChar = ' ';
		// long max = Integer.MIN_VALUE;
		int max = 0;
		for (int i = 0; i < text.length(); i++) {
			Character c = text.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}
			if (map.get(c) > max) {
				maxChar = c;
				max = map.get(c);
			}
		}
		return maxChar;
	}

	public static void main(String args[]) {
		String text = "wfaveqr caaaaaaaaaaaaf";
		System.out.println("The max character is : " + findMaxOChar(text));
	}
}
