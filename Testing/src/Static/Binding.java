package Static;

public class Binding {
//Connecting method call to method body is binding
	//Static binding is when type of object is determined at compile time
	//Static binding ex
	 void m() {
		System.out.println("dog");
	}
	public static void main (String[]args) {
		Binding ss = new Binding(); 
			ss.m();
		
	}
}
