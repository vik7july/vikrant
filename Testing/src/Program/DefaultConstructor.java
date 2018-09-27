package Program;

public class DefaultConstructor {
	String name;
	int id;
     DefaultConstructor(){
    	System.out.println(id+" "+name);
}

	public static void main(String[] args) {
		// Default constructor is used to provide default value to object
		DefaultConstructor dd = new DefaultConstructor();
		DefaultConstructor d1 = new DefaultConstructor();
		//dd.display();
		//d1.display();

	}

}
