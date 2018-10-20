package test;

public  class Staticclass {
	public void m() {
		
	}
	public static class TT{
		public static void m2() {
			System.out.println("dd");
			
		}
	}
	public static void main(String []args) {
		//TT oo = new TT();
		TT.m2();
		
	}

}
