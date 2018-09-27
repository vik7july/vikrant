package Program;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SpecialCharInJava {
	public static void main(String[] args) {

		Pattern pattern = Pattern.compile("[ !\\\"#$%&'()*+,-./:;<=>?@\\\\[\\\\]^_`{|}~]");
		
		String str = "abc@!$%^&*";
		Matcher matcher = pattern.matcher(str);

		if (!matcher.matches()) {
			System.out.println("string '" + str + "' contains special character");
		} else {
			System.out.println("string '" + str + "' doesn't contains special character");
		}

	}

}
