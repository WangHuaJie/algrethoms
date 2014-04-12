/*
	this program will fistly create a random int array(from 0 to 10000) in the ROM
	,and then ,write the array on the diskfile
*/

public class createRandomData{
	public static void main(String[] args) throws Exception{
		java.io.File data = new java.io.File("randomData.txt");       		//
		java.io.PrintWriter output = new java.io.PrintWriter(data); 		//create a java.io.PrintWriter object for the txt file 

		int[] arr = new int[10000];
		creatArray(arr);

		for(int i=0;i<arr.length;i++)
			output.print(arr[i]+" ");

		output.close();                               //close the file
	
	}

	public static void creatArray(int[] arr){         //create a random  int arrayq jmim arr[]
		for(int i=0;i<arr.length;i++)
			arr[i] = (int)(Math.random()*(10001));
	}
}