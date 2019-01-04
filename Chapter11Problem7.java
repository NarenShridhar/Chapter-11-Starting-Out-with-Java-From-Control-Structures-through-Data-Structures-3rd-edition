import java.io.*;

public class Chapter11Problem7
{
	public static void main (String[] args) throws IOException
	{
		/**
			Created a String variable called filenameToRead which will hold the first, english file. 
		*/

		String filenameToRead = ("/Users/NarenShridhar/Documents/JavaPrograms/ChapterElevenProgrammingChallenges/FileToRead.txt");

		/**
			Created a String variable called filenameToWrite which will hold the file for the
			 encrypted code to be written too. 
		*/

		String filenameToWrite = ("/Users/NarenShridhar/Documents/JavaPrograms/ChapterElevenProgrammingChallenges/FileToWrite.txt");

		/**
			Created a String variable called finalFile which will hold the final file, which is initialy empty
			which will be filled with the decrypted code. 
		*/

		String finalFile = ("/Users/NarenShridhar/Documents/JavaPrograms/ChapterElevenProgrammingChallenges/FinalFile.txt");

		/**
			Called the encryption class/method to encrypt the file. 
		*/

		FileEncryption.encryptFile(filenameToRead, filenameToWrite);

		/**
			Called the decryption class/method to decrypt the file. 
		*/

		FileDecryption.decryptFile(filenameToWrite, finalFile);
	}
}

