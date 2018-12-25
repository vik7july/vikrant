package program3;

import java.util.HashMap;

public class MaxOccuringCharInStringCount {
	public static long findMaxOChar(String text) {
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		Character maxChar = ' ';
		//long max = Integer.MIN_VALUE;
		int max=0;
		for (int i = 0; i < text.length(); i++) {
			Character current = text.charAt(i);
			if (map.containsKey(current)) {
				map.put(current, map.get(current) + 1);
			} else {
				map.put(current, 1);
			}
			if (map.get(current) > max) {
				maxChar = current;
				max = map.get(current);
			}
		}
		return max;
	}

	public static void main(String args[]) {
		String text = "wfaveqr caaaa";
		System.out.println("The max character is : " + findMaxOChar(text));
	}

}