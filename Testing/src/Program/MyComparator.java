package Program;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyComparator implements Comparator<Object> {

    Map<String, Integer> map;

    public MyComparator(Map<String, Integer> map) {
        this.map = map;
    }

    public int compare(Object o1, Object o2) {

        if (map.get(o2) == map.get(o1))
            return 0;	
        else if
        	(map.get(o2) > map.get(o1))
            return -1;	
        else 
        return 1;
            //return ((Integer) map.get(o2)).compareTo((Integer)     
                                                            //map.get(o1));

    }

	public static void main(String[] args) {
		Map<String, Integer> lMap = new HashMap<String, Integer>();
	    lMap.put("A", 35);
	    lMap.put("B", 75);
	    lMap.put("C", 50);
	    lMap.put("D", 50);
	    System.out.println(lMap);

	    MyComparator comparator = new MyComparator(lMap);

	    Map<String, Integer> newMap = new TreeMap<String, Integer>(comparator);
	    newMap.putAll(lMap);
	    System.out.println(newMap);
		

	}

}
