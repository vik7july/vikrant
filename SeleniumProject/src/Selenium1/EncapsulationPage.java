package Selenium1;

//In POM page factory method work on this
//Binding data member and methods
//Hiding of data is encapsulation
public class EncapsulationPage {
//private variable can only be accessed by public method
	private int age;
	private String name;
//setter and getter method to access private variable
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age =age;
	}
	public void setName(String string) {
		this.name =name;
	}

}
