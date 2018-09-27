package Program;

import java.util.HashMap;

import Static.Car;

public class FreqofEachCharusingCollection {

	public static void main(String[] args) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		String s = "aasjjikkk";
		for (int i = 0; i < s.length(); i++) {
//char[] c1= s.toCharArray();
			char c = s.charAt(i);
			if (map.containsKey(c)) {
				int val = map.get(c);
				int x = val + 1;
				map.put(c, x);
			} else {
				map.put(c, 1);
			}
		}
		for (HashMap.Entry m : map.entrySet()) {
			// System.out.println(m);
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}
}
