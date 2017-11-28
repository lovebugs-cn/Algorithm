package sort;

public class SelectSort {
	
	public void selectSort(int[] arr){
		for(int i = 0; i < arr.length; i ++){
			int minIndex = i;
			for(int j = i + 1; j < arr.length; j ++){
				if(arr[j] < arr[minIndex])
					minIndex = j;
			}
			swap(arr,i,minIndex);
		}
	}
	
	public static void swap(int[] arr,int i,int j){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}
	
}
