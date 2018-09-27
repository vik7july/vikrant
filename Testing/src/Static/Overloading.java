package Static;
//Method Overloading multiple method with same name but different parameter
// method overloading increases readability of program
//two ways of method overloading
//changing  datatype, argument \\
//method overloading is not possible by changing return type only
// when we create static method we dont need object to create
public class Overloading{
	static int add(int a, int b) {
		return a+b;
		}
	static double add(double a, double b) {
		return a+b;
	}
		public static void main(String[] args){  
			System.out.println(add(11,11));
			System.out.println(add(11,11.22));
		}
	}
	


