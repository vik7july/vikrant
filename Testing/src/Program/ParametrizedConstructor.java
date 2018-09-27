package Program;

public class ParametrizedConstructor {
	String name;
	int id;
	ParametrizedConstructor(int id, String name){
		this.id = id;
		this.name = name;
		{System.out.println(id+" "+name);}
	}
	void display() {System.out.println(id+" "+name);}
	
	public static void main(String[]args) {
		ParametrizedConstructor pc1 = new ParametrizedConstructor(11,"test");
		ParametrizedConstructor pc2 = new ParametrizedConstructor(22, "dddd");
		//pc1.display();
		//pc2.display();
	}
	

}
