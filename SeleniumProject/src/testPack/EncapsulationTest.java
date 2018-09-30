package testPack;

import Selenium1.EncapsulationPage;

public class EncapsulationTest {
	public static void main(String[] args) {
		EncapsulationPage ep = new EncapsulationPage();
		ep.setAge(20);
		ep.setName("Radhe");
		System.out.println(ep.getAge());
		System.out.println(ep.getName());
	}

}
