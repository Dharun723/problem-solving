package Problem_solving_oops;
//Write a Java program to create a class called "Cat" with instance variables name and age. 
//Implement a default constructor that initializes the name to "Unknown" and the age to 0. 
//Print the values of the variables.
public class cat {
     private String name;
     private int age;
     public cat() {
		 this.name="Tilly.";
		 this.age = 3;
     }
public static void main (String []args) {
	cat ca1= new cat();
	System.out.println("cat name:"+ca1.name);
	System.out.println("cat age:"+ca1.age);


     }
 
}
