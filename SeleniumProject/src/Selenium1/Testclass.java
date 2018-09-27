package Selenium1;

import java.text.ParseException;

public class Testclass {
	
	public static void main(String[] args) throws ParseException {
	String test ="1234";
	int tt =Integer.parseInt(test);
	System.out.println(tt);
	
	
	String string = "004-034556";
	String[] parts = string.split("-");
	String part1 = parts[0]; // 004
	System.out.println(part1);
	String part2 = parts[1];
	System.out.println(part2);
	
	}
    
}
