/**
	This is the default class creation line for creating an exception class. 
*/

public class InvalidPrice extends Exception
{
	/**
		The constructor for this class accepts a double value as an argument. 
		In this case, if the price for the retail item is negative, the 
		InvalidPrice exception will be thrown and the statement will be printed.
	*/

	public InvalidPrice(double negativePriceGiven)
	{
		/**
			Passed the below string (which uses the constructor argument) to the 
			superclass constructor. 
		*/

		super("\nThe price $" + negativePriceGiven + " is negative, and is invalid.");
	}
}