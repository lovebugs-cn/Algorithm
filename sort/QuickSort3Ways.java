package sort;

public class QuickSort3Ways {
	
	public void quickSort3Ways(int[] arr){
		__quickSort3Ways(arr,0,arr.length - 1);
	}
	
	public void __quickSort3Ways(int[] arr,int l,int r){
		
		if(l >= r)
			return;
		
		int lt = l;
		int gt = r + 1;
		int i = l + 1;
		int v = arr[l];
		while(i < gt){
			if(arr[i] < v){
				swap(arr,i,lt + 1);
				i ++;
				lt ++;
			}else if(arr[i] > v){
				swap(arr,i,gt - 1);
				gt --;
			}else{
				i ++;
			}
		}
		
		swap(arr,l,lt);
		
		__quickSort3Ways(arr,l,lt - 1);
		__quickSort3Ways(arr,gt,r);
		
	}
	
	public void swap(int[] arr,int i,int j){
		
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		
	}

}
