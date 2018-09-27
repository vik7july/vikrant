package Program;

//constructor overloading can be done
//constructor cannot be static, final, abstract
//constructor donot have return type
//constructor return current class instance
//constructor is used to initailize object
//method is used to expose behaviour of object
//there is no copy constructor in java
public class ConstructorOverlaoding {
	 
	    int id;  
	    String name;  
	    int age;  
	    //creating two arg constructor  
	    ConstructorOverlaoding(int i,String n){  
	    id = i;  
	    name = n;  
	    }  
	    //creating three arg constructor  
	    ConstructorOverlaoding(int i,String n,int a){  
	    id = i;  
	    name = n;  
	    age=a;  
	    }  
	    void display(){System.out.println(id+" "+name+" "+age);}  
	   
	    public static void main(String args[]){  
	    	ConstructorOverlaoding s1 = new ConstructorOverlaoding(111,"Karan");  
	    	ConstructorOverlaoding s2 = new ConstructorOverlaoding(222,"Aryan",25);  
	    s1.display();  
	    s2.display();  
	   }  

}
