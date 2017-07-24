import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Main {
	

	public static void main(String[] args) throws InterruptedException {
		int guessingNumber = 100;
		int computersGuess = 10;
		int distance = 0;
		int boundaryValue = 10; 
		boolean computerHasNumber = false;
		System.out.println("Please Guess the number: ");
		
		
		
		while(computerHasNumber == false)
		{
			Random rand = new Random();
			distance = guessingNumber - computersGuess;
			int randomNumber = rand.nextInt(boundaryValue) + 1;
			
			if (computersGuess == guessingNumber)
			{
				computerHasNumber = true;
				System.out.println("You found my number!");
			
			}
			
			else if (computersGuess < guessingNumber)
			{
				System.out.println(increment(computersGuess , randomNumber));
				computersGuess = increment(computersGuess , randomNumber);
				//boundaryValue = guessingBoundary (distance);
				System.out.println("Higher");
			}
			else
			{
				System.out.println(decrement(computersGuess, randomNumber));
				computersGuess = decrement(computersGuess , randomNumber);
				//boundaryValue = guessingBoundary (distance);
				System.out.println("Lower");
			}
			
			
			//System.out.println(guessingNumber);
			//System.out.println(computersGuess);
			
			
			
			//TimeUnit.SECONDS.sleep(1);
		}
		

	}
	
	public static int increment (int computerGuess , int randomNumber)
	{
		computerGuess = computerGuess + randomNumber;
		return computerGuess;
		
	}
	
	public static int decrement (int computerGuess, int randomNumber)
	{
		computerGuess = computerGuess - randomNumber;
		return computerGuess;
	}
	
	public static int guessingBoundary (int distance)
	{
		
		int boundaryValue = 0;
		if (distance <=  5)
		{
			System.out.println("boiling");
		}
		else if (distance > 5 && distance <= 10)
		{
			System.out.println("super warm");
		}
		else if (distance > 10 && distance < 20 )
		{
			System.out.println("super cold");
		}
		else
		{
			System.out.println("freezing");
		}
		
		return boundaryValue;
	}

}
