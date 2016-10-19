import java.util.Scanner;

public class HelloWorld
{
	public static void main(String[ ]args)
	{
		/**
		String x = "Hello World";
		int y = 5;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x + " " + y);
		
		System.out.println("This is a program that will add two numbers based on your input.");
		System.out.println("This will add two numbers");
		int x = 25;
		int y = 22;s
		System.out.println("The numbers are '\f' and '\f'", x, y );
		System.out.println(x + y);
		**/
		
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
		
		System.out.println("This will be a number guessing game.");
		
		System.out.println("Please select a difficulty setting.");
		System.out.println("type 1 for easy mode");
		System.out.println("type 2 for normal mode");
		System.out.println("type 3 for hard mode");
		int numberOfChances = 3;
		
		int difficulty = inputUser.nextInt();
		/**if(difficulty <= 1)
		{
			numberOfChances = 3;
			double answer = Math.random() * 10;
			System.out.println("Easy mode selected.");
		}
		if(difficulty == 2)
		{
			numberOfChances = 4;
			double answer = Math.random() * 10;
			System.out.println("Normal mode selected.");
		}
		if(difficulty >= 3)
		{
			numberOfChances = 5;
			double answer = Math.random() * 10;
			System.out.println("Normal mode selected.");
		}
		**/
		System.out.println("You will have " + numberOfChances + " chances.");

		//Random num = new Random();
		//int answer = num.nextInt(10);
		int answer;
		int answerAsInt = answer;
		
		boolean userWin = false;
		
		//System.out.println(answer);
		
		System.out.println("The number will be between 1 and 10.");
		
		for(int i = 0; i < numberOfChances; i++)
		{
			System.out.println("Your guess is...");
			int userInt1 = inputUser.nextInt();
			if (answerAsInt == userInt1)
			{
				System.out.println("YOU WIN! PLAY AGAIN?");
				userWin = true;
				break;
			}
			else if (userInt1 > answer)
			{
				System.out.println("TOO HIGH! GUESS AGAIN.");
			}
			else
			{
				System.out.println("TOO LOW! GUESS AGAIN.");
			}
		}
		if (userWin == false)
		{
			System.out.println("YOU LOSE! PLAY AGAIN?");
		}
		
	}
}