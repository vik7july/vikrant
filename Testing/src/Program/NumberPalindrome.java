package Program;

public class NumberPalindrome {

	 public static void main(String args[])  
	   {  
	      String original="12321";
	      String reverse = "";    
	      System.out.println(original);  
	       
	      int length = original.length();   
	      for ( int i = length - 1; i >= 0; i-- )  
	         reverse = reverse + original.charAt(i);  
	      if (original.equals(reverse))  
	         System.out.println("Entered string/number is a palindrome. "+reverse);  
	      else  
	         System.out.println("Entered string/number isn't a palindrome.");   
	   }

}
