package Static;
//super is used to invoke parent class constructor

public class Janwar extends Animal {
	String color = "Black";
	void printColor() {
		System.out.println(color);
		System.out.println(super.color);	
}
	void m() {
		System.out.println("dwd");
	}
	void ss() {
		System.out.println("ss");
		super.m();
		
	}
	
	/*public static void main(String[] args) {
		Janwar dd  = new Janwar();
		dd.printColor();
	}*/
	

}
