package Program;
//constructor is used for object creation, calling method

public class CopyConstructor {
	String name;
	int id;
	CopyConstructor(String n, int i){
		name = n;
		id = i;
	}
		CopyConstructor(CopyConstructor c){
			name = c.name;
			id = c.id;
		}
			void display() {
				System.out.println(id+ " "+name);
			}
		public static void main(String []args) {
			CopyConstructor cd = new CopyConstructor("Raj", 3);
			CopyConstructor cd1 = new CopyConstructor("cha", 5);
			cd.display();
			cd1.display();
	}
}