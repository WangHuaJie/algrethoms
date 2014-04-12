/*
	this program will firstly read a text file from the current 
	dictionay (diskfile) to the ROM,and then ,translate the file 
	content from string to integer.and then sort the array.and 
	last ,print the array on the screen.
*/
	
import java.util.Scanner;

public class bubble{
	public static void main(String[] args) throws Exception {
		int[] arr = new int[10000];

		readInData(arr);
//		bubbleSort(arr);
		bubbleSortImproved(arr);
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

	public static void creatArray(int[] arr){         //create a random  int array arr[]
		for(int i=0;i<arr.length;i++){
			arr[i] = (int)(Math.random()*(10001));
		}
	}

	public static void showArray(int[] arr){          //print the array
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}

	public static void bubbleSort(int[] arr){            //bubble sorting the array arr[]
		int sign = 0;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				sign++;                                 //signing the cycle index
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
		System.out.println("the cycle index is: "+sign);
	}

	public static void bubbleSortImproved(int[] arr){           //improved bubble sorting
		boolean needNextPass = true;
		for(int i=0;i<arr.length && needNextPass;i++){
			needNextPass = false;
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
					needNextPass = true;
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

}