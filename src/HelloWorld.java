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
		
		int playAgain = 1;
		
		while (playAgain == 1)
		{
			System.out.println("This will be a number guessing game.");

			System.out.println("Please select a difficulty setting.");
			System.out.println(" Type 1 for easy mode");
			System.out.println(" Type 2 for normal mode");
			System.out.println(" Type 3 for hard mode");
			int numberOfChances = 3;
			double answer = 2;
			
			int difficulty = 0;
			int answerMax = 0;
			
			while (difficulty != 1 && difficulty !=2 && difficulty !=3)
			{
				difficulty = inputUser.nextInt();
				
				if(difficulty == 1)
				{
					System.out.println("Easy mode selected.");
					numberOfChances = 3;
					answerMax = 5;
					answer = Math.random() * answerMax + 1;
				}
				else if(difficulty == 2)
				{
					System.out.println("Normal mode selected.");
					numberOfChances = 3;
					answerMax = 10;
					answer = Math.random() * answerMax + 1;
				}
				else if(difficulty == 3)
				{
					System.out.println("Hard mode selected.");
					numberOfChances = 3;
					answerMax = 15;
					answer = Math.random() * answerMax + 1;
				}
				else
				{
					System.out.println("No comprehende. Do it again.");
				}
				
			

			//Random num = new Random();
			//int answer = num.nextInt(10);
			int answerAsInt = (int)answer;
			
			boolean userWin = false;
			
			//System.out.println(answer);
			
			System.out.println("The number will be between 1 and " + answerMax + ". Good luck!");
			System.out.println("You will have " + numberOfChances + " chances.");
			
			for(int i = 0; i < numberOfChances; i++)
			{
				System.out.println("Your guess is...");
				int userInt1 = inputUser.nextInt();
				if (answerAsInt == userInt1)
				{
					System.out.println("YOU WIN!\nThe number was " + answerAsInt + ".\nPLAY AGAIN?");
					userWin = true;
					playAgain = inputUser.nextInt();
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
				System.out.println("YOU LOSER!\nThe number was " + answerAsInt + ".\nPLAY AGAIN?");
				playAgain = inputUser.nextInt();
			}
			
			}
		
		}
	}
}