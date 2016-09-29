import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[ ]args)
	{
		// String x = "Hello World";
		// int y = 5;
		// System.out.println(x);
		// System.out.println(y);
		// System.out.println(x + " " + y);
		
		// System.out.println("This is a program that will add two numbers based on your input.");
		// System.out.println("This will add two numbers");
		// int x = 25;
		// int y = 22;s
		// System.out.println("The numbers are '\f' and '\f'", x, y );
		// System.out.println(x + y);
		
		Scanner inputUser = new Scanner(System.in);
		/** System.out.println("Provide two numbers below:");
		int userInt1 = inputUser.nextInt();
		int userInt2 = inputUser.nextInt();
		
		// System.out.println(userInt1);
		// System.out.println(userInt2);
		
		
		int largerInt = 0;
		if(userInt1 > userInt2)
		{
			largerInt = userInt1;
		}
		else
		{
			largerInt = userInt2;
		}
		
		System.out.println("The larger number input is:");
		
		System.out.println(largerInt);
		**/
		
		System.out.println("This will be a game of guessing a number");
		
		int numberOfChances = 3;
		
		System.out.println("You will have " + numberOfChances + " chances.");
		
		double answer = Math.random() * 10;
		int answerAsInt = (int)answer;
		
		boolean userWin = false;
		
		for(int i = 0; i < numberOfChances; i++)
		{
			System.out.println("Guess:");
			int userInt1 = inputUser.nextInt();
			if(answerAsInt == userInt1)
			{
				System.out.println("YOU WIN!");
				userWin = true;
				break;
			}
			else if (userInt1 > answer)
			{
				System.out.println("TOO HIGH!");
			}
			else
			{
				System.out.println("TOO LOW!");
			}
		}
		if (userWin == false)
		{
			System.out.println("YOU LOSE!");
		}
		
	}
}