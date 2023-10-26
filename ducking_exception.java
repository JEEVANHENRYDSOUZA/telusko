package jeevan;

import java.util.Scanner;

//Exception ducking is a practice where a method informs the 
//caller (typically through the method's declaration or 
//documentation) that it may throw an exception, which 
//should be handled by the caller. This is commonly done by 
//declaring a checked exception in the method's 
//throws clause or by documenting the exceptions that the method may throw.






class Demo
{
	void alpha()throws Exception
	{
		System.out.println("Connection2 is Established to An App");
		Scanner scan =new Scanner(System.in);
		
		
		System.out.println("Kindly enter the numerator to divide ");
		int num1=scan.nextInt();
		System.out.println("Kindly enter the denominator");
		int num2=scan.nextInt();
		
		int res=num1/num2;

		System.out.println("The result is : "+ res);
		
		
		System.out.println("Connection2 is termintaed from An App");
		
	}
}
public class ducking_exception {

	public static void main(String[] args) 
	{
		System.out.println("Connection1 is Established to An App");
		try
		{
		Demo d=new Demo();
		d.alpha();
		}
		catch(Exception e)
		{
			System.out.println("Exception is handling in main method");
		}
		
		System.out.println("Connection1 is termintaed from An App");



	}

}
