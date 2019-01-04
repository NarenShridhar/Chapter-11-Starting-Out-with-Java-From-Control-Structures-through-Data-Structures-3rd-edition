public class RetailItemAdvanced
{
	/**
		Created a String field called description which references a String object that holds a 
		brief description of the item. 
	*/

	String description;

	/**
		Created an int field called unitsOnHand which holds the number of units that are
		current in inventory.
	*/

	int unitsOnHand;

	/**
		Created a double field called price which holds the item's retail price. 
	*/

	double price;

	/**
		Constructor, calls the setter methods created below, two of which throw exceptions
		if they hold negative values. The constructor is required to throw both the InvalidNumber
		and InvalidPrice exceptions because the methods could throw those exceptions. 
	*/

	public RetailItemAdvanced(String descriptionGiven, int unitsOnHandGiven, double priceGiven) throws InvalidNumber, InvalidPrice
	{
		setDescription(descriptionGiven);
		setUnitsOnHand(unitsOnHandGiven);
		setPrice(priceGiven);
	}

	/**
		Created a the setter method setDescription, which sets the argument of descriptionGiven
		to the value of the description field. 
	*/

	public void setDescription(String descriptionGiven)
	{
		description = descriptionGiven;
	}

	/**
		Created the getter method for description, getDescription.
	*/

	public String getDescription()
	{
		return description;
	}

	/**
		Created the setter method setUnitsOnHand, which sets the argument of unitsOnHandGiven
		to the value of the unitsOnHand field. 

		Additionally, if the unitsOnHandGiven is less than 0 (negative), this method will throw
		an InvalidNumber exception from the InvalidNumber class I created for this problem.
	*/

	public void setUnitsOnHand(int unitsOnHandGiven) throws InvalidNumber
	{
		/**
			If the unitsOnHandGiven is < 0...
		*/

		if(unitsOnHandGiven < 0)
		{
			/**
				throw a new InvalidNumber exception.
			*/

			throw new InvalidNumber(unitsOnHandGiven);
		}

		/**
			Else...
		*/

		else
		{
			/**
				Set the unitsOnHand to the unitsOnHandGiven.
			*/

			unitsOnHand = unitsOnHandGiven;
		}
	}

	/**
		Created the getter method for the unitsOnHand
	*/

	public int getUnitsOnHand()
	{
		return unitsOnHand;
	}

	/**
		Created the setter method setPrice, which sets the argument of priceGiven
		to the value of the price field. 

		Additionally, if the price is less than 0.0 (negative), this method will throw
		an InvalidPrice exception from the InvalidPrice class I created for this problem.
	*/

	public void setPrice(double priceGiven) throws InvalidPrice
	{
		/**
			If the priceGiven is < 0.0...
		*/

		if(priceGiven < 0)
		{
			/**
				throw a new InvalidPrice exception.
			*/

			throw new InvalidPrice(priceGiven);
		}

		/**
			Else...
		*/

		else
		{
			/**
				Set the price to the priceGiven.
			*/

			price = priceGiven;
		}
	}

	/**
		Created the getter method for the price
	*/

	public double getPrice()
	{
		return price;
	}
}