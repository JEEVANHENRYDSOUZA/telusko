package jeevan;

import java.util.Arrays;


// all classes are either directly or indirectly derived 
// from the Object class. The Object class is the root class
// for all Java classes, which means every class you create in 
// Java is, by default, a subclass of Object. This common ancestry 
// allows you to store instances of any class in a two-dimensional 
// Object array since all objects in 
// Java ultimately inherit the methods and properties of the Object class.





class Student1
{
	String name;
	int age;
	
}

class Dog11
{
	int cost;
}

class Fan1
{
	String brand;
	
}








public class Object_array 
{

	public static void main(String[] args) 
	
	{
		
Object []studentArray=new Object[4];
		
		studentArray[0]=new Student1();
		studentArray[1]=new Student1();
		//studentArray[2]=new Student();
		studentArray[2]=new Dog11();
		studentArray[3]=new Fan1();
		
		
		
		
		
		
		
		
		

		

	}

}
