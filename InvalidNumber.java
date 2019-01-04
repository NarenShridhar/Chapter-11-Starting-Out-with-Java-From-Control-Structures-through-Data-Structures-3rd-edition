/**
	This is the default class creation line for creating an exception class. 
*/

public class InvalidNumber extends Exception
{
	/**
		The constructor for this class accepts a double value as an argument. 
		In this case, if the number of units on hand of the retail item is negative, the 
		InvalidNumber exception will be thrown and the statement will be printed.
	*/
	public InvalidNumber(int negativeNumberGiven)
	{
		/**
			Passed the below string (which uses the constructor argument) to the 
			superclass constructor. 
		*/

		super("\nThe units on hand " + negativeNumberGiven + " is negative, and is invalid.");
	}
}