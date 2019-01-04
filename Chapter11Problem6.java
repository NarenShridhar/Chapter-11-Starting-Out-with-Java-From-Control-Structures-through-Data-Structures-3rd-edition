import java.io.*;

public class Chapter11Problem6
{
	public static void main (String[] args) throws IOException
	{
		/**
			Created an array to hold set values
		*/

		int[] array = {1, 2, 3, 4, 5};

		/**
			Created a blank array that the values will be read into using the FileArray class and its methods.
		*/

		int[] array2 = new int[array.length];

		/**
			The filename to be used.
		*/

		String filename = "/Users/NarenShridhar/Documents/JavaPrograms/ChapterElevenProgrammingChallenges/FileArrayFile.dat";

		/**
			Write the array to the file. 
		*/

		FileArray.writeArray(filename, array);

		/**
			Read the file and store it in the second array.
		*/

		FileArray.readArray(filename, array2);
	}
}