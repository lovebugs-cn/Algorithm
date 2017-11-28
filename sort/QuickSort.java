package sort;

public class QuickSort {
	
	public void quickSort(int[] arr){
		__quickSort(arr,0,arr.length - 1);
	}
	
	public static void __quickSort(int[] arr,int l,int r){
		
		if(l >= r)
			return;
		
		int p = partition(arr,l,r);
		
		__quickSort(arr,l,p - 1);
		__quickSort(arr,p + 1,r);
		
	}
	
	public static int partition(int[] arr,int l,int r){
		
		swap(arr,l,(int) (Math.random() * (r-l+1) + l));
		int v = arr[l];
		int k = l;
		for(int i = l + 1;i <= r; i ++){
			if(arr[i] < v){
				swap(arr,i,k + 1);
				k ++;
			}
		}
		swap(arr,l,k);
		
		return k;
	}
	
	public static void swap(int[] arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}
