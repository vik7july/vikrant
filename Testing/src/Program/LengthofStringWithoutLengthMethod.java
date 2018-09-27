package Program;

	import java.util.Scanner;

	public class LengthofStringWithoutLengthMethod {
		
		// Method to find length of given string without length method
		public static int getLengthWithoutLengthMethod(String input)
		{
			// lastIndexOf("") will give us length of string. 
			int position= input.lastIndexOf("g");
			return position;
		}

		public static void main(String[] args) {

			// User input for the string to know length
			//Scanner sc = new Scanner(System.in);
			
			String userInput= "Testingggg";
			//String userInput= sc.nextLine();
			
			//sc.close();
			
			System.out.println("You entered: "+userInput);
			
			System.out.println("Length of string \""+userInput +"\" is :" +getLengthWithoutLengthMethod(userInput));
			
			

		}
	}


