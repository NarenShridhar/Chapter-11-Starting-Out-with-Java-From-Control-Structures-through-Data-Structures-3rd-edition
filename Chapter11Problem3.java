import java.util.Scanner;

public class Chapter11Problem3
{
	/**
		Main method must throw both exceptions that could possibly occur within this class. 
	*/

	public static void main (String[] args) throws InvalidNumber, InvalidPrice
	{
		/**
			Created 3 RetailItemAdvanced objects without values.
		*/

		RetailItemAdvanced retailItem1, retailItem2, retailItem3;

		/**
			Assigned the values of the 3 objects in the try block, if any of the setter
			methods called in the class's constructor cause an error, the approrpriate
			try blocks below will catch them. 
		*/

		try
		{
			retailItem1 = new RetailItemAdvanced("Mattress", 25, 100.00);
			retailItem2 = new RetailItemAdvanced("Video Game", 50, 60.00);
			retailItem3 = new RetailItemAdvanced("Candy", -100, 1.00);
		}

		catch(InvalidNumber e)
		{
			System.out.println(e.getMessage());
		}

		catch(InvalidPrice e)
		{
			System.out.println(e.getMessage());
		}
	}
}