package jeevan;


// encapsulation
// in capsule only inside the capsule can access
// the methods + the variables declared



class encapsulation1{
	
	private int age;
	private String name;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}








// short cut for generating getter and setter is
// right click source 
// generate getter setter

public class encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		encapsulation1 encap= new encapsulation1();
		
		encap.setAge(100);
		int age =encap.getAge();
		System.out.println(age);
		encap.setName("this is encapsulation");
		String name=encap.getName();
		System.out.println(name);
		
		
		
		
	}

}
