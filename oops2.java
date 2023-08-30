package jeevan;

class Dog{
	
	
	private String name;
	private int age;
	private int cost;
	
	
	
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
	
	
	
	
	
	
	
	
	
	
}










public class jeevan {
	
	public static void main(String[] args) {
	    System.out.println("Hello World!");
	    
	   Dog d1 = new Dog();
	   
	   d1.setAge(60);
	   
	   d1.setCost(1000);
	   
	   d1.setName("sheru");
	
	
	}

}