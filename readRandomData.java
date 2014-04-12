/*
	this program will firstly read a text file from the diskfile 
	to the ROM,and then ,translate the file content from string 
	to integer.In the end ,print the integer array on the screen.
*/
import java.util.Scanner;

public class readRandomData{
	public static void main(String[] args) throws Exception{
		java.io.File data = new java.io.File("randomData.txt");
		Scanner input = new Scanner(data);

		int[] arr = new int[10000];

		int i = 0;
		while(input.hasNext()){
			arr[i] = input.nextInt();
			i++;
		}

		input.close();

		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}