import java.io.*;

public class FileArray
{
	/**
		Created a static method called writeArray. This method accepts two arguments, the name of a file, 
		and a reference to an int array. The file will be opened as a binary file, and the contents
		of the array will be written to the file. Then the file is closed. 
	*/

	public static void writeArray(String filenameGiven, int[] intArrayGiven) throws IOException
	{
		/**
			Created an instance of the FileOutputStream class, which has the ability to open a file
			for binary output and establish a connection wtih it. The name of the file that the user
			wishes to open is passed as a string to the constructor. 
		*/

		FileOutputStream fStream = new FileOutputStream(filenameGiven);

		/**
			Created an instance of the DataOutputStream object that is connected to the FileOutputStream
			reference by fStream. The result of this statement is that the outputFile variable will
			reference an object that is able to write binary data to the file. 
		*/

		DataOutputStream outputFile = new DataOutputStream(fStream);

		/**
			Printed the contents of the array.
		*/

		System.out.println("\nPrinting the contents of the array...");

		/**
			For loop increments the index of intArrayGiven in order to print its contents. 
		*/

		for(int i = 0; i < intArrayGiven.length; i++)
		{
			System.out.print(intArrayGiven[i] + " ");
		}

		/**
			Write the array to the file. 
		*/

		System.out.println("\nWriting the contents of the array to the file...");

		/**
			For loop increments the index of intArrayGiven in order to write its contents.

			CRITICAL NOTE! WHEN OPENING A .DAT FILE W/ TEXT EDITOR, THE CONTENTS WILL NOT APPEAR.
			IT WILL LOOK AS THOUGH THE FILE IS EMPTY. THAT IS NOT THE CASE! OPEN THE .DAT FILE
			IN SUBLIME TEXT TO SEE THE BINARY DATA OF THE FILE IN BINARY FORMAT! IT WILL BE THERE! 
		*/	

		for(int i = 0; i < intArrayGiven.length; i++)
		{
			outputFile.writeInt(intArrayGiven[i]);
		}

		/**
			Let the user know the program is done. 
		*/

		System.out.print("Done\n");

		/**
			Close the file. 
		*/

		outputFile.close();
	}

	/**
		Created a static method called readArray. This method accepts two arguments, the name of a file, 
		and a reference to an int array. The file will be opened as a binary file, and the contents
		of the array will be read to the empty array.
	*/

	public static void readArray(String filenameGiven, int[] intArrayGiven) throws IOException
	{
		/**
			Created an instance of the FileInputStream class, which has the ability to open a file
			for binary output and establish a connection wtih it. The name of the file that the user
			wishes to open is passed as a string to the constructor. 
		*/

		FileInputStream fStream = new FileInputStream(filenameGiven);

		/**
			Created an instance of the DataInputStream object that is connected to the FileInputStream
			reference by fStream. The result of this statement is that the inputFile variable will
			reference an object that is able to read binary data to the array. 
		*/

		DataInputStream inputFile = new DataInputStream(fStream);

		/**
			Transfer the contents of the file to the array.
		*/

		System.out.println("\nAssigning values from the file to the new array...");


		for(int i = 0; i < intArrayGiven.length; i++)
		{
			intArrayGiven[i] = inputFile.readInt();
		}

		/**
			Printed the contents of the array.
		*/

		System.out.println("Printing the contents of the array...");

		/**
			For loop increments the index of intArrayGiven in order to print its contents. 
		*/

		for(int i = 0; i < intArrayGiven.length; i++)
		{
			System.out.print(intArrayGiven[i] + " ");
		}

		/**
			Let the user know the program is done. 
		*/

		System.out.println("\nDone");
	}
}