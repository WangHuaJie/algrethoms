/*
	this program will firstly read a text file from the current 
	dictionay (diskfile) to the ROM,and then ,translate the file 
	content from string to integer.and then sort the array.and 
	last ,print the array on the screen.
*/

import java.util.Scanner;

public class choiceSort{
	public static void main(String[] args) throws Exception {
		int[] arr = new int[10000];

		readInData(arr);
		sort(arr);
		showArray(arr);
	}

	public static void readInData(int[] arr) throws Exception {
		java.io.File data = new java.io.File("randomData.txt");

		//if the file doesn't exists,then create it 
		if(!data.exists()){                            
			java.io.PrintWriter output = new java.io.PrintWriter(data);
			
			//create a random array in the ROM and then write it on the diskfile
			creatArray(arr);
			for(int i=0;i<arr.length;i++)
				output.print(arr[i]+" ");

			output.close();
		}

		Scanner input = new Scanner(data);
		int i = 0;
		while(input.hasNext()){
			arr[i] = input.nextInt();
			i++;
		}

		input.close();
	}

	public static void creatArray(int[] arr){         //create a random  int arrayq jmim arr[]
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*(10001));
		}
	}

	public static void sort(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j] < arr[i]){
					swap(arr,i,j);
				}
			}
		}
	}
	public static void swap(int[] arr,int a1,int a2){
		int tmp;
		tmp = arr[a1];
		arr[a1] = arr[a2];
		arr[a2] = tmp;
	}

	public static void showArray(int[] arr){          //print the array
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}

	
	
}