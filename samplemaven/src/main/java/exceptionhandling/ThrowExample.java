package exceptionhandling;

public class ThrowExample {

	public static void main(String[] args) {
		int a= 13;
		if(a>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			//System.out.println("Not eligible to vote");
			throw new ArithmeticException("Not eligible to vote");
		}
		

	}

}
