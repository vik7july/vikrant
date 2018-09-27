package program2;

public class RemoveWhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "India   is mother ";
String nospace = s.replaceAll("\\s","");
System.out.println(nospace);
	}

}
