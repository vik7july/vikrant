package exception;

public class Exceptionn {

	public static void main(String[] args) {
		try {
			int a =50/0;
			int W[]= new int[5];
			W[4]=5; 
		}
		catch(ArithmeticException e){
			System.out.println(e);
			
		}
		System.out.println("rest of the code");
	}

}
