package Program;

public class ReverseStringUsingStringBuilder {

	public static void main(String[] args) {
		
		String str = "ABCDEF";
		StringBuilder sb = new StringBuilder(str);
		//StringBuilder Reverse = sb.reverse();
		System.out.println(sb.reverse());
	}

}
