package sort;

public class MergeSort {
	
	public void mergeSort(int[] arr){
		__mergeSort(arr,0,arr.length - 1);
	}
	
	public void mergeSortBU(int[] arr){
		int n = arr.length;
		for(int sz = 1; sz < n; sz += sz){
			for(int i = 0; i + sz < n; i += sz + sz){
				__merge(arr,i,i + sz - 1, min(i + 2 * sz - 1,n - 1));
			}
		}
	}

	public void __mergeSort(int[] arr,int l,int r){
		
		int mid = (l + r) / 2;
		
		if(l >= r)
			return;
		
		__mergeSort(arr,l,mid);
		__mergeSort(arr,mid + 1,r);
		__merge(arr,l,mid,r);
		
	}
	
	public void __merge(int[] arr,int l,int mid,int r){
		
		int[] aux = new int[r - l + 1];
		for(int i =l ; i <= r; i ++)
			aux[i - l] = arr[i];
		
		int i = l,j = mid + 1;
		for(int k = l; k <= r; k ++){
			if(i > mid){
				arr[k] = aux[j - l];
				j ++;
			}
			else if(j > r){
				arr[k] = aux[i - l];
				i ++;
			}
			else if(aux[i - l] < aux[j - l]){
				arr[k] = aux[i - l];
				i ++;
			}
			else{
				arr[k] = aux[j - l];
				j ++;
			}
		}
	}
	
	public int min(int i,int j){
		if(i < j){
			return i;
		}else{
			return j;
		}
	}
}
