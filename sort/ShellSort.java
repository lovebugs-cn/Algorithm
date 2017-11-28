package sort;

public class ShellSort {
	
	public void shellSort(int[] arr){
		
		int n = arr.length;
		for(int gap = n / 2; gap > 0; gap /= 2){
			for(int i = gap; i < n; i ++){
				for(int j = i - gap;j >= 0; j -= gap){
					if(arr[j] > arr[j + gap])
						swap(arr,j,j + gap);
				}
			}
		}
	}
	
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
