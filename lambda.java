package jeevan;

interface Calc{
	
	
	void show();
	
	
}






public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Calc obj= new Calc() {
			
			
				public void  show() {
					System.out.println("hi");
				}
			
		};
		obj.show();
		
		Calc obk = ()->{
			System.out.println("hi");

			
		};
		obk.show();
		// lambda expression works only with sam or functional interface
		
		
		// only plus point of using anonymous class is we do not create any extra class
		// file
		

	}

}
