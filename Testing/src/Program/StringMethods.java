package Program;

public class StringMethods { 
	public static void main(String args[]){  
		String name="javatpoint";  
		char ch=name.charAt(4);//returns the char value at the 4th index  
		System.out.println(ch);  
		
		String s1="hello";  
		String s2="hello";  
		String s3="meklo";  
		String s4="hemlo";  
		String s5="flag";  
		System.out.println(s1.compareTo(s2));//0 because both are equal  
		System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
		System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
		System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"
		String s11="hello";  
		String s21="";  
		String s31="me";
		//If we compare with empty string it gives length of string 
		System.out.println(s21.toString());
		System.out.println(s11.compareTo(s21));  
		System.out.println(s21.compareTo(s31));
		
		//concat
		
		String ss1="java string";  
		ss1.concat("is immutable");  
		System.out.println(ss1);  
		ss1=ss1.concat(" is immutable so assign it explicitly");  
		System.out.println(ss1);  
		System.out.println(ss1.hashCode());
		
		//contains is case sensitive return boolean
		String mame="what do you know about me";  
		System.out.println(mame.contains("do you know"));  
		System.out.println(mame.contains("y"));  
		System.out.println(mame.contains("hello"));  
		
		//ends with return boolean
		String sa1="java by javatpoint";  
		System.out.println(sa1.endsWith("t"));  
		System.out.println(sa1.endsWith("point"));
		
		//get Bytes
		 String saa1 = "ABCDEFGaa";  
	        byte[] barr = saa1.getBytes();  
	        for(int i=0;i<barr.length;i++){  
	            System.out.println(barr[i]);  
	        }  
	        String s="javatpoint";  
	        String s23="python";  
	        System.out.println("string length is: "+s.length());//10 is the length of javatpoint string  
	        System.out.println("string length is: "+s23.length());//6 is the length of python string
		//Value of method convert any value to string
	        int value=30;  
	        String s111=String.valueOf(value);  
	        System.out.println(s111+10);//concatenating string with 10  
		
	}

}
