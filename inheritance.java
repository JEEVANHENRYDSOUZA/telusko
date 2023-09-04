package jeevan;


class a{
	
	
	
	public a() {
		System.out.println("in a");
	}
	
	
	
	public a(int num) {
		this();
		System.out.println("in sum a");
	}
	
	
	
	
	
	
}




class b extends a {
	
	
	public b() {
		
		
		super();// will call the parent constructor by default 
		//this  will be there even if we dont see it
		System.out.println("in b");
	}
	
	
	public b(int num) {
		
		super (num);
		
		// this will call the un-parametrized constructor of class b
		

		
		System.out.println("in sum b");
	}
	
	// we can only use this or super in a constructor as
	// they should be the final statement 
	// as this and super are called first
	// we cannot make two calls together
	//hence we cannot use them both together
	
}











public class inheritance {

	
	public static void main(String[] args) {
		
		
		System.out.println("inheritance");
		
		
		b obj = new b(5);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
