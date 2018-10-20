package Program;

import java.util.*;  
import java.io.*;  
public class Comparatorrr implements Comparable<Comparatorrr>{  
		  
		int age;  
		Comparatorrr(int age){  
		this.age=age;  
		}  
		  
		public int compareTo(Comparatorrr dd){  
		if(age==dd.age)  
		return 0;  
		else if(age>dd.age)  
		return 1;  
		else  
		return -1;  
		}  
		
public static void main(String args[]){  
ArrayList<Integer> al=new ArrayList<Integer>();  
al.add(23);  
al.add(27);  
al.add(21);  
al.add(354);
al.add(2);

//Comparatorrr ss = new Comparatorrr(al);
//Collections.sort(al);  
for(Integer st:al){  
System.out.println(st);  
}  
}  
} 
