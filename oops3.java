package jeevan;

class Dog{
	
	
	private String name;
	private int age;
	private int cost;
	
	
	
	
	
	
	
	
	Dog (String name, int age, int cost){
		
		
		
		this.name=name;
		this.age=age;
		this.cost=cost;
	}
	
	
	
	// if we do not mention only then  then java complier will
	// include a zero parametrized  default constructor
	// we can have more than one constructor for method overloading
	
}










public class jeevan {
	
	public static void main(String[] args) {
	    System.out.println("Hello World!");
	    
	   Dog d1 = new Dog("sheru",10,10000);
	   
	 
	
	
	}

}
