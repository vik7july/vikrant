package Static;

 class ThisConstructor {
	ThisConstructor(){System.out.println("test");}
	ThisConstructor(int x){
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisConstructor dd = new ThisConstructor(10);
		
		

	}

}
