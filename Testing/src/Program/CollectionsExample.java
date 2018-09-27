package Program;
import java.util.*; 
public class CollectionsExample { 
	    public static void main(String[] a){      
	        List<String> list = new ArrayList<String>();  
	        list.add("C");  
	        list.add("Core Java");  
	        list.add("Advance Java");  
	        System.out.println("Initial collection value:"+list);  
	        Collections.addAll(list, "Servlet","JSP");  
	        System.out.println("After adding elements collection value:"+list);  
	        String[] strArr = {"C#", ".Net"};  
	        Collections.addAll(list, strArr);  
	        System.out.println("After adding array collection value:"+list);
	        
	        List<Integer> list1 = new ArrayList<Integer>();  
	        list1.add(46);  
	        list1.add(67);  
	        list1.add(24);  
	        list1.add(16);  
	        list1.add(8);  
	        list1.add(12);  
	        System.out.println("Value of maximum element from the collection: "+Collections.max(list1)); 
	        System.out.println("Value of minimum element from the collection: "+Collections.min(list1));
	  }  
	    }  
	