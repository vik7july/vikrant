package Static;
// for method 
//default modifier only within package\
//class cannot be private or protected except nested
//protected within package and outside package through inheritancce
//default modifier is more restrictive
//if superclass method doesnot declare exception subclass overridden method cannot declare cheked exception 

import java.io.IOException;

public class MethodOverriding extends Vehicle{
	 void run() {
		System.out.println("dwdfwf");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding ss = new MethodOverriding();
		try {
			ss.run();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	

}
