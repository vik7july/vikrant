package program2;

import java.util.Scanner;

public class CharPosition {

	public static void main(String[] args) {

		String myString = "fdserfgty";
		
		//for (int i = 0; i < 9; i++) {
		    
		    String even = "";
		    String odd = "";
		    for (int j = 0; j < myString.length(); j++) {
		        if (j % 2 == 0) {
		            even += myString.charAt(j);
		        } else {
		            odd += myString.charAt(j);
		        }
		    }

		    System.out.println(even + " " + odd);
		//}
	}
}

	


