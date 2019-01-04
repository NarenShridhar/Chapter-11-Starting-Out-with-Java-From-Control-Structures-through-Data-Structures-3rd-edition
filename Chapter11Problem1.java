import java.util.Scanner;

/**
	import statement is required for InputMismatchException.
*/

import java.util.InputMismatchException;

public class Chapter11Problem1
{
	public static void main (String[] args)
	{
		/**
			Created a double array (userArray) to hold the array the user will input
			for the test scores. 
		*/

		double[] userArray;

		/**
			Created an int variable userArraySize to hold the size of the userArray.
			This value is initialized to -1 because if this prints it would signify 
			an error.
		*/

		int userArraySize = -1;

		/**
			Created a boolean variable bError, which will be used in 
			the first do-while loop as the condition to be checked for as to whether 
			a new integer for the size of the array must be entered. 
		*/
		
		boolean bError = true;

		/**
			Created a boolean variable bError2, which will be used in the second
			do-while loop as the condition to be checked for as to whether a new 
			double value for a particular test score elment should be entered. 
		*/

		boolean bError2 = true;

		/**
			Created a Scanner object called keyboard to take in the user's input.
		*/

		Scanner keyboard = new Scanner(System.in);

		/**
			Call the display method created below. 
		*/

		display();


		/**
			Do-while loop serves to repeatedly ask the user to enter an integer value for the
			number of test scores they are entering.
		*/

		do
		{
			/**
				Try block tests whether an InputMismatchException will be thrown.
				If the user enters anything that is not an integer, the appropriate
				catch block below will be triggered via an InputMismatchException. 
			*/

			try
			{

			/**
				Get the size of the array from the user.
			*/

			System.out.println("User, how many test scores do you want to enter?");

			/**
				Set the size of userArraySize.
			*/

			userArraySize = keyboard.nextInt();

			/**
				Now, if there is no exception thrown (meaning the value entered is an integer), 
				then bError can be set to true. 

				Note, if an exception is thrown, this statement will be skipped, meaning that
				bError will not be set to true, and the program will loop again after asking the user
				to re-enter a value. 

				Once an appropriate value is entered, bError will be set to true, and the loop
				will cease. 
			*/

			bError = true;

			/**
				If the number entered for userArraySize is 1...
			*/

			if(userArraySize == 1)
				{
					/**
						Inform the user that there is no need to calculate the average score for 1 test because
						the average of a single test is that score itself. 
					*/

					System.out.println("User, there is no need to use this program to calculate the average for a single test." + 
					"\nThe average for 1 test is that score itself.");

					/**
						Get the size of the array from the user.
					*/
					System.out.println("User, please enter an integer value for the amount of test scores you want" + 
						" averaged that is greater than 1");

					/**
						Set the size of userArraySize.
					*/
					userArraySize = keyboard.nextInt();
				}
			}

			/**
				Catch block for InputMismatchException that will be accessed if a non-integer value
				is passed into userArraySize.
			*/

			catch(InputMismatchException e)

			{
				/**
					If the catch block is triggered, it means that a non-integer variable was passed
					into userArraySize. If this is the case, it means that bError should be set to false, 
					so that the loop will be triggered to run again. 
				*/

				bError = false;

				/**
					Error message for the front-end of the program to let the user know they entered
					a non-integer. 
				*/

				System.out.println("User, you entered a non-integer. Please enter a non-decimal number for the number of tests " + 
					"that you need an average for: ");

				/**
					Keyboard.nextLine() required so that the reader skips to the proper next line. Otherwise an infinite loop
					will occur since the next line will automatically not be an integer, triggering another catch block. 
				*/

				keyboard.nextLine();
				
			}

		/**
			While the catch block is triggered, the program will loop till an appropriate
			value has been entered for the userArraySize. 
		*/

		} while(bError == false);
		
		/**
			Now that the value for userArray has been obtained, assign the size of the userArray to 
			that of userArraySize. 
		*/

		userArray = new double[userArraySize];

		/**
			Do-while loop serves to prompt the user to re-enter a double value for a test score 
			when anything but a double value has been entered. 
		*/ 

		do
		{
			/**
				For loop increments the index of the userArray in order to assign values
				for each element. 
			*/

			for(int i = 0; i < userArray.length; i++)
			{
				/**
					Try block tests whether an InputMismatchException will be thrown. 
					If anything but a double is assigned to an element, the InputMismatchException
					will be triggered. 
				*/

				try
				{
					/**
						Get the score for each test. 
					*/

					System.out.println("User, please enter a double value for test score " + (i + 1));

					/**
						Set the score for each test. 
					*/

					userArray[i] = keyboard.nextDouble();

					/**
						Now, if there is no exception thrown (meaning the value entered is a double), 
						then bError2 can be set to true. 

						Note, if an exception is thrown, this statement will be skipped, meaning that
						bError2 will not be set to true, and the program will loop again after asking the user
						to re-enter a value. 

						Once an appropriate value is entered, bError2 will be set to true, and the loop
						will cease. 
					*/

					bError2 = true;
				}

				catch(InputMismatchException e)
				{

					/**
						If the catch block is triggered, it means that a non-double variable was passed
						into that particular element of the array. If this is the case, it means that 
						bError2 should be set to false, so that the loop will be triggered to run again. 
					*/

					bError2 = false;

					/**
						Error message for front end to indicate that the user should re-enter
						an appropriate value for the test score. 
					*/

					System.out.println("User, you entered a non-double value for test score " + (i + 1));

					/**
						Keyboard.nextLine() required so that the reader skips to the proper next line. Otherwise an infinite loop
						will occur since the next line will automatically not be an integer, triggering another catch block. 
					*/

					keyboard.nextLine();

					/**
						If the code has gotten to this point, it means an error was thrown. 
						Make sure to decrement the index or it will not assign the correct
						values properly. 
					*/

					i--;
				}
			}

		/**
			While the catch block is triggered, the program will loop till an appropriate
			value has been entered for the userArraySize. 
		*/

		} while(bError2 == false);

		/**
			Created a new TestScores object, averageScores.
		*/

		TestScores averageScores = new TestScores(userArray);

		/**
			Calling the TestScores toSting method will print the average score.
		*/

		System.out.println(averageScores);
	}

	/**
		Created a void method display which will outline the objectives
		for this program.
	*/

	public static void display()
	{
		System.out.println();
		System.out.println("User, this program will ask you to enter the number of test scores you want to calculate the average for.");
		System.out.println("It will then ask you to enter each test score. ");
		System.out.println("If any of the scores are out of range of the acceptable values (0-100), it will throw an IllegalArgumentException");
		System.out.println("After you've input all the values it will return the average");
		System.out.println();
	}
}