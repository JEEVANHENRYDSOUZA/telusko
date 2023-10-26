package jeevan;

import java.util.Scanner;

// when you rethrow an exception in Java, it gets 
// thrown to the caller, and if the caller has
// a catch block for that exception type, that catch block is 
// executed. If no catch block in the caller handles the rethrown 
// exception, it will continue to propagate up the call stack until a suitable 
// catch block is found or until it reaches the top level
// of the program (where unhandled exceptions may cause the program to terminate).


// when we write throw it is like return statement nothing after it gets executed



class Demo1
{
	void alpha()throws Exception
	{
		System.out.println("Connection2 is Established to An App");
		Scanner scan =new Scanner(System.in);
		try
		{
		
		System.out.println("Kindly enter the numerator to divide ");
		int num1=scan.nextInt();
		System.out.println("Kindly enter the denominator");
		int num2=scan.nextInt();
		
		int res=num1/num2;

		System.out.println("The result is : "+ res);
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in alpha()");
			throw e;
		}
		
		finally
		{

		System.out.println("Connection2 is termintaed from An App");
		}
		
	}
}
public class rethrowing_exception {

	public static void main(String[] args) 
	{
		System.out.println("Connection1 is Established to An App");
		try
		{
		Demo1 d=new Demo1();
		d.alpha();
		}
		catch(Exception e)
		{
			System.out.println("Exception is handled in main method");
		}
		
		System.out.println("Connection1 is termintaed from An App");



	}

}
