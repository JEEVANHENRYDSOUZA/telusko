package jeevan;


class c{
	
	
	
	public void method_overloading() {
		
			System.out.println("hello");
		
	}
	
	public void method_overloading(int num) {
		
		
		
		
		System.out.println("Overloaded Method");
	}
	
	
	
}













public class ploymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("polymorphism");
		
		
		c obj= new c();
		
		
		obj.method_overloading(10);
		
		

	}

}
