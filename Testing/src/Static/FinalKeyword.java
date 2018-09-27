package Static;

public class FinalKeyword {
//Final variable value cannot be changed
	//final method cannot be overrided
	//final stops inhertaince
	//we extends class not method
	//final class cannot be extended means inherited
	//final method inherited but cannot override
// we can initaialize blank final variable but only in constructor
	//final method is inherited but not overrided
	//constructor is not inherited thats why constructor cannot be final
	//Runtime polymorphism cannot be achieved by data member
	final int speedlimit;//blank final variable  
    
	FinalKeyword(){  
	  speedlimit=70;  
	  System.out.println(speedlimit);  
	  }  
	  
	  public static void main(String args[]){  
	    new FinalKeyword();  
	 }  
}
