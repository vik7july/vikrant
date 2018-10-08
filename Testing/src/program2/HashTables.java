package program2;

import java.util.Hashtable;
import java.util.Map;

public class HashTables {
	public static void main(String args[]){  
		Hashtable<Integer, String> hm= new Hashtable<Integer, String>();
		hm.put(100, "haldi");
		hm.put(103, "fffkk");
		hm.put(99,"wfwef");
		for(Map.Entry m:hm.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
			
		}
	}

}
