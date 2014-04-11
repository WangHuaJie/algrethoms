public class bubble{
	public static void main(String[] args){
		int[] arr = new int[10];

		creatArray(arr);
		System.out.print("create random int array arr[]:               ");
		showArray(arr);
		bubbleSort(arr);
		System.out.print("after bubble sorting the random array arr[]: ");
//		bubbleSortImproved(arr);
//		System.out.print("after the improving of bubble sorting :      ");
		showArray(arr);

	}

	public static void creatArray(int[] arr){         //create random int array arr[]
		for(int i=0;i<10;i++){
			arr[i] = (int)(Math.random()*(101));
		}
	}

	public static void showArray(int[] arr){          //print the array arr[] in order
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
	}

	public static void bubbleSort(int[] arr){            //pop sort the random array arr[]
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					swap(arr,j,j+1);
				}
			}
		}
	}

	public static void bubbleSortImproved(int[] arr){           //improving pop sorting
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