package Static;
// this is used to refer current class instance variable
// this is used to invoke current class method
// this can be used to invoke current class constructor

public class This {
	
	void m() {
		System.out.println("Print it");
	};	
	void n() {
		System.out.println("go oo");
		this.m();//m();//same as this.m()  
		
	}
	

 
public static void main(String args[]){  
	This a=new This();  
a.n();  
}
}  
