package jeevan;

public class Finally {
	
	// no matter what happens finally block is always executed
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = divide(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero.");
        } finally {
            System.out.println("This block always gets executed.");
        }
    }

    public static int divide(int numerator, int denominator) {
        return numerator / denominator;
    }
}
