package Program;

import java.util.ArrayList;
import java.util.List;

public class ConvertListtoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<String>();
		//add some stuff
		list.add("android");
		list.add("apple");
		String[] stringArray = list.toArray(new String[list.size()]);
		System.out.println(stringArray);

	}

}
