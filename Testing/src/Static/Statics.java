package Static;
//static is used for memory managemagt
// static can be method, variable, nested class, block
//static variable gets memory at once at time of class loading
// static method belong to class rather than object
//this and super cannot be used with static
//static method cannot access non static data member and method directly

public class Statics {
	static int a=40;// static  
	   
	 public static void main(String args[]){  
	  System.out.println(a);  
	 }

}
