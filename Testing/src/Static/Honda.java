package Static;
//Abstract class cannot be instantiated
//factory method return instance of class
// If there is abstract method in class, class must be adstract
//we can extend abstract class 
//but cannot instantiate abstarct class
//Interface is blueprint of class
//Interface is used to achieve abstraction              	
//Interface can be inherited but cannot be instantiated
//private, static , default method in interface
//Interface support multiple inheritance and achicve abstraction
 class Honda extends Bike {
	 
	 void run() {
		 System.out.println("qwd");
	 }
	 
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bike oj = new Honda();
		oj.run();

	}

}
