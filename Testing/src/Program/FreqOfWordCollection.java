package Program;

import java.util.HashMap;

public class FreqOfWordCollection {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<String, Integer>();

		String s1 = "Ram Is Good But Ram Is Ram";
		String[] s = s1.split(" ");

		int total = s.length;

		for (int i = 0; i < total; i++) {

			String c = s[i];

			if (map.containsKey(c)) {
				int val = map.get(c);
				int x = val + 1;
				map.put(c, x);
			} else {
				map.put(c, 1);
			}
		}
		for (HashMap.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}