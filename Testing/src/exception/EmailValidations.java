package exception;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String email = sc.next();
		//String regx = "^(.+)@(.+)$";
		String regx = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9+_.-]+((.[a-zA-Z]\\s){1,3})";
		//String regx = "^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+(?:\\\\.[a-zA-Z0-9_!#$%&’*+/=?`{|}~^-]+)*@[a-zA-Z0-9-]+(?:\\\\.[a-zA-Z0-9-]+)*$";
		Pattern pat = Pattern.compile(regx);
		Matcher matcher = pat.matcher(email);
		System.out.println(email +" : "+ matcher.matches());
	}
}
/*package testtt;

public class HackerRankSampleQ {
static String findNumber(List<Integer> arr, int k) {
        
        for(Integer i: arr){
            if(i==k){
                return "YES";
            }
            

        }
return "NO";

    }

2 question

static List<Integer> oddNumbers(int l, int r) {
    
    List<Integer> ss = new ArrayList<Integer>();
    for(int i=l; i<=r; i++){
        if(i%2!=0){
            ss.add(i);
            
        }
    }
return ss;

}

}
*/