package jeevan;


class parent{
	
	
	
	public void method_overriding() {
		
			System.out.println("hello");
		
	}
	
	
	
	
	
}



class children extends parent{
	
	
	
public void method_overriding() {
		
		
		
		
		System.out.println("Overrided Method");
	}
	
	
	
	
}













public class ploymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("polymorphism");
		
	parent obj = new children(); 
		
		
		obj.method_overriding();
		
		

	}

}
