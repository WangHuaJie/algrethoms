public class choiceSort{
	public static void main(String[] args){
		int[] arr = new int[10];

		creatArray(arr);
		System.out.print("create random int array arr[]:               ");
		showArray(arr);
		sort(arr);
		System.out.print("after choice sorting the random array arr[]: ");
		showArray(arr);
	}

	public static void creatArray(int[] arr){         //create a random  int array arr[]
		for(int i=0;i<10;i++){
			arr[i] = (int)(Math.random()*(101));
		}
	}

	public static void showArray(int[] arr){          //print the array
		for(int i=0;i<10;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\n");
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
}