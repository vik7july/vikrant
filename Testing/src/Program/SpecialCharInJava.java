package Program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharInJava {
	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("[^A-Za-z0-9]");

		String str = "ab#cdefgg";
		Matcher m = pattern.matcher(str);
		boolean b = m.find();
		if (b == true) {
			System.out.println("string '" + str + "' contains special character");
		} else {
			System.out.println("string '" + str + "' doesn't contains special character");

		}

	}

}
