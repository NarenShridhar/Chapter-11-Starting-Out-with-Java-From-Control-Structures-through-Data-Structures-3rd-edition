import java.io.*;
import java.io.Serializable;

public class Chapter11Problem9Serialize 
{
	public static void main (String[] args) throws Exception
	{
		double[] array1 = {1, 2, 3, 4, 5};
		double[] array2 = {6, 7, 8, 9, 10};
		double[] array3 = {11, 12, 13, 14, 15};
		double[] array4 = {16, 17, 18, 19, 20};
		double[] array5 = {21, 22, 23, 24, 25};

		TestScores scoresArray1 = new TestScores(array1);
		TestScores scoresArray2 = new TestScores(array2);
		TestScores scoresArray3 = new TestScores(array3);
		TestScores scoresArray4 = new TestScores(array4);
		TestScores scoresArray5 = new TestScores(array5);

		TestScores[] scoresArrayFinal = {scoresArray1, scoresArray2, scoresArray3, scoresArray4, scoresArray5};

		String inputFileName = ("/Users/NarenShridhar/Documents/JavaPrograms/ChapterElevenProgrammingChallenges/SerializedFile.dat");

		FileOutputStream outStream = new FileOutputStream(inputFileName);

		ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);

		for(int i = 0; i < scoresArrayFinal.length; i++)
		{
			objectOutputFile.writeObject(scoresArrayFinal[i]);		
		}

		objectOutputFile.close();

		FileInputStream inStream = new FileInputStream(inputFileName);

		ObjectInputStream objectInputFile = new ObjectInputStream(inStream);

		for(int i = 0; i < scoresArrayFinal.length; i++)
		{
			objectInputFile.readObject();
		}

		objectInputFile.close();

		for(int i = 0; i < scoresArrayFinal.length; i++)
		{
			System.out.println(scoresArrayFinal[i]);
		}

	}
}