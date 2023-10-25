package jeevan;

class Dog{
	
	
	
	private String name;
	private int age;
	
	
	
	Dog(String name, int a){
		
		
		this.name=name;
		this.age=a;
		System.out.println("paramterezid");
	}
	
	
	Dog(){
		
		/// unparamterzed
		System.out.println("Dog");
		
		
	}
	
	
}








public class constructorj {

	public static void main(String[] args) {

   Dog d = new Dog("jeevan",10);
   // this will call the paramterized constructor
   
   
   Dog d1 = new Dog();		
// this will call the unparamterized constructor
   
   
	}

}
