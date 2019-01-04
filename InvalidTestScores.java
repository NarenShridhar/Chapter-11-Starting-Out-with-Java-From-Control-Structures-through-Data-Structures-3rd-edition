public class InvalidTestScores extends IllegalArgumentException
{
	 public InvalidTestScores(double scoreGiven)
	 {
	 	super("\nError: Score is out of range!");
	 }
}