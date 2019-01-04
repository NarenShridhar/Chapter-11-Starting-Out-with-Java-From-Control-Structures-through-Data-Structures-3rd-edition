import java.io.*;
import java.util.Scanner;

public class FileDecryption
{
	/**
		Created a static void method called decryptFile which will read the contents of the coded file created 
		using the FileEncryption class, and will restore the data to its original state, and write it to 
		another file. This method will accept two arguments, the name of the file with the coded date, 
		and the name of another new file to store the converted data to. 
	*/

	public static void decryptFile(String codedFileName, String blankFileName) throws IOException
	{
		/**
			Create a File object for the file to be read. 
		*/

		File file = new File(codedFileName);

		/**
			Create a Scanner object using the file object that was just created. 
		*/

		Scanner inputFile = new Scanner(file);

		/**
			Create a PrintWriter object for the file to written to. 
		*/

		PrintWriter outputFile = new PrintWriter(blankFileName);

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

				int helpfulInt = (int)(helpfulChar);

				/**
					Created another char variable helpfulChar2 which will convert helpfulInt
					back into a char, and this time will subtract 10 from it. 
				*/

				char helpfulChar2 = (char)(helpfulInt - 10);

				/**
					Print the modified code to the empty file. 
				*/

				outputFile.write(helpfulChar2);
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