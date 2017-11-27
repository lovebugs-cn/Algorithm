package algorithm;

public class MinNum {
	
	public static int minNum(int[] arr) {
		
		if(arr == null || arr.length <= 0)
			return -1;
		
		int index1 = 0;
		int index2 = arr.length - 1;
		int midIndex = index1;
		while(arr[index1] >= arr[index2]) {
			if(index2 - index1 == 1) {
				midIndex = index2;
				break;
			}
			
			midIndex = (index1 + index2) / 2;
			
			//如果下标为index1,index2和midIndex指向的三个数字相等，则只能顺序查找
			if(arr[index1] == arr[index2] && arr[index1] == arr[midIndex]) {
				return minInOrder(arr,index1,index2);
			}
			
			if(arr[midIndex] >= arr[index1]) {
				index1 = midIndex;
			}else if(arr[midIndex] <= arr[index2]) {
				index2 = midIndex;
			}
		}
		
		return arr[midIndex];
	}
	
	public static int minInOrder(int[] arr,int index1,int index2) {
		int minNum = arr[index1];
		for(int i = index1; i <= index2; i ++) {
			if(arr[i] < minNum)
				minNum = arr[i];
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		int[] arr1 = new int[] {3,4,5,1,2};
		int[] arr2 = new int[] {1,0,1,1,1};
		System.out.println("arr1中最小数字为" + minNum(arr1));
		System.out.println("arr2中最小数字为" + minNum(arr2));
	}
}
