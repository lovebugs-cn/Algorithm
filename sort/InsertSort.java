package sort;

public class InsertSort {
	
	public void insertSort(int[] arr){
		
		for(int i = 1; i < arr.length; i ++){
			int e = arr[i];
			int j;
			for(j = i; j > 0 && arr[j - 1] > e; j --){
					arr[j] = arr[j - 1];
			}
			arr[j] = e;
		}
	}

}
