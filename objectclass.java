package jeevan;

// by default all class are children of the object class
// this keyword refers to the current object
//  super keyword is used to call the parent class constructor
// if there is no parent class then it will call  the object class constructor
// this() will call the child class constructor or the constructor 
// of that constructor whose object we create
// always remember when use this() there can nothing be about this() call
// we can have this() or super() call
class Dog3
{
	private String name;
	private int age;
	private int cost;
	public Dog3()
	{   
		this("Sheeru", 4, 34444);
		System.out.println("calling a constructor from inside a constructor");
		
	}
	public Dog3(String name, int age, int cost)
	{
		this("Lobo");
		this.name=name;
		this.age=age;
		this.cost=cost;	
		System.out.println("this is unparametrized");
		
	}
	public Dog3(String name)
	{
		super();
		
		this.name=name;	
		age=44;
		cost=54444;
		System.out.println("this is single name");
	}
	
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public int getCost() {
		return cost;
	}
	
}








public class objectclass {

	public static void main(String[] args) {
		

		Dog3 d2=new Dog3();
		
		// first unparametrezied constructor is called
		
		
		
	}

}
