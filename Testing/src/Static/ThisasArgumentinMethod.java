package Static;
//

public class ThisasArgumentinMethod {
	void m(ThisasArgumentinMethod o) {
		System.out.println("sfew");
		
	}
	void p() {
		m(this);
	}
public static void main (String [] args) {
	ThisasArgumentinMethod ss = new ThisasArgumentinMethod();
	ss.p();
}
}
