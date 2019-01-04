import java.io.Serializable;

public class TestScores implements Serializable
{
	/**
		Created a double array called userArray, to represent the array of test score values 
		that the user will provide. 
	*/

	double[] userArray;

	/**
		Created a Constructor that accepts an array of test scores as its argument.
	*/

	public TestScores(double[] testScoresGiven) throws InvalidTestScores
	{
		/**
			Set the size of the user array equal to the size of the testScoresGiven array.
		*/

		userArray = new double[testScoresGiven.length];

		/**
			As the index of the testScoresGiven array increments...
		*/

		for(int i = 0; i < testScoresGiven.length; i++)
		{
			/**
				If the current value of the testScoresGiven array is less than 0 or greater than 100...
			*/

			if(testScoresGiven[i] < 0 || testScoresGiven[i] > 100)
			{

				/**
					Throw a new InvalidTestScores...
				*/

				throw new InvalidTestScores(testScoresGiven[i]);
			}

			/**
				Otherwise, the value is in bounds.

				The value of the userArray at each index, equals the value of the testScoresGiven array
				at that same corresponding index.
			*/

			else
			{
				userArray[i] = testScoresGiven[i];
			}
		}
	}

	/**
		Created a double method getAverage which will return the average of the test scores.
	*/

	public double getAverage()
	{
		/**
			Created a double variable total which will hold the total of the elements in 
			the userArray. The variable is initialzied initially to 0.0.
		*/

		double total = 0.0;

		/**
			For loop increments the index of userArray.
		*/

		for(int i = 0; i < userArray.length; i++)
		{
			/**
				The total is equal to each element of the userArray (each test score), 
				plus the existing values before it. 
			*/

			total += userArray[i];
		}

		/**
			Return the average of the test scores.
		*/

		return total/userArray.length;
	}

	/**
		toString method
	*/

	public String toString()
	{
		/**
			Created a String variable output to hold the String output. 
		*/

		String output;

		/**
			Assigned the value of output.
		*/

		output = String.format("The average of the test scores you entered was: %.2f",  getAverage());

		/**
			Return the output.
		*/

		return output;
	}
}