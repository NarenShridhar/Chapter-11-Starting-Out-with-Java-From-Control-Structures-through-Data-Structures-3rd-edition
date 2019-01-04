import java.util.Scanner;
import java.io.*;

public class FileEncryption
{
	/**
		Created a static method called encryptFile which will read the contents
		of an existing file, and modify the data into a code, and then write
		the coded contents into a second file. The second file will be a version
		of the first file, but written in a secret code. 

		This method accepts a String argument representing the name of the file
		to be read, as well as another String argument representing the name 
		of the file to be written too. 
	*/

	public static void encryptFile(String fileToRead, String fileToWrite) throws IOException
	{
		/**
			Create a File object for the file to be read. 
		*/

		File file = new File(fileToRead);

		/**
			Create a Scanner object using the file object that was just created. 
		*/

		Scanner inputFile = new Scanner(file);

		/**
			Create a PrintWriter object for the file to written to. 
		*/

		PrintWriter outputFile = new PrintWriter(fileToWrite);

		/**
			The hasNext method is boolean, and returns true if this Scanner has another token 
			in its input. 
		*/

		while(inputFile.hasNext())
		{
			/**
				Created a String variable helpfulString and assigned it to the value of
				inputFile.nextLine. 

				The nextLine method is a useful Scanner method that advances the scanner
				past the current line and returns the input that was skipped. 
			*/

			String helpfulString = inputFile.nextLine();

			/**
				For loop increments the elements in the string. 
			*/

			for(int i = 0; i < helpfulString.length(); i++)
			{
				/**
					Created a char variable helpfulChar which will hold each character
					within the String scanned via inputFile. 
				*/

				char helpfulChar = helpfulString.charAt(i);

				/**
					Created an int variable helpfulInt which will convert the 
					helpfulChar variable into its corresponding integer value. 
				*/

				int helpfulInt = (int)helpfulChar;

				/**
					Created another char variable helpfulChar2 which will convert helpfulInt
					back into a char, and this time will add 10 to it. 
				*/

				char helpfulChar2 = (char)(helpfulInt + 10);

				/**
					Print the modified code back to the file. 
				*/

				outputFile.print(helpfulChar2);
			}

			/**
				Print a line once the current line's string is done. 
			*/

			outputFile.println();
		}

		/**
			Don't forget to close both files, else the program will not copy properly!
		*/
			
		inputFile.close();
		outputFile.close();
	}
}