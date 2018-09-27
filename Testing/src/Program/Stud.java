package Program;

class Stud implements Comparable<Stud>{  
int rollno;  
String name;  
int age;  
Stud(int rollno,String name,int age){  
this.rollno=rollno;  
this.name=name;  
this.age=age;  
}  
  
public int compareTo(Stud st){  
if(age==st.age)  
return 0;  
else if(age>st.age)  
return 1;  
else  
return -1;  
}  
}  
