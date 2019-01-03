package Program;
public class BreakandContinue {

	public static void main(String[] args) {
		for (int counter = 0; counter<10; counter++) {
		    System.out.println(counter);

		if (counter == 4) {

		    break;
		}
		else {
			System.out.println("acd");
		}
		
   }
		System.out.println("Test");
		
		for(int c=0; c<10; c++) {
			System.out.println(c);
			if(c==4) {
				continue;
			}
			System.out.println("Testing");
		}
		//Ternary Operator
		String status;
        int rank = 3;
        status = (rank == 1) ? "Done" : "Pending";
        System.out.println(status);
        
        
    
	}
	
}
