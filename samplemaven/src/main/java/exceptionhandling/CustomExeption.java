package exceptionhandling;

public class CustomExeption {

	public static void main(String[] args) throws VotingException, AgeException, CitizenException {
		int a= 13;
		if(a>=18)
		{
			System.out.println("Eligible to vote");
		}
		else
		{
			
			throw new CitizenException("Not eligible to vote");
		}

	}

}
