/*package Program;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class ComparatorArray implements Comparator<Object> {

	List<Integer> map;

	public ComparatorArray(List<Integer> map) {
		this.map = map;
	}

	public int compare(Object o1, Object o2) {

		if (map.get(o2) == map.get(o1))
			return 0;
		else if (map.get(o2) > map.get(o1))
			return -1;
		else
			return 1;
		// return ((Integer) map.get(o2)).compareTo((Integer)
		// map.get(o1));

	}

	public static void main(String[] args) {
		List<Integer> lMap = new ArrayList<Integer>();
		lMap.add(35);
		lMap.add(75);
		lMap.add(50);
		lMap.add(50);
		System.out.println(lMap);

		ComparatorArray comparator = new ComparatorArray(lMap);

		List<Integer> newMap = new LinkedList<Integer>(comparator);
		newMap.addAll(lMap);
		System.out.println(newMap);
	}
}
*/