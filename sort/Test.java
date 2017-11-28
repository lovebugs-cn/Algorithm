package sort;

import java.util.Arrays;

public class Test {
	
	public static void main(String[] args){
		
		int arr１[] = new int[]{10,9,8,7,6,5,4,3,2,1};
		SelectSort s1 = new SelectSort();
		s1.selectSort(arr１);
		System.out.println("选择排序结果：" + Arrays.toString(arr１));
		
		int arr２[] = new int[]{10,9,8,7,6,5,4,3,2,1};
		BubbleSort s2 = new BubbleSort();
		s2.bubbleSort(arr２);
		System.out.println("冒泡排序结果：" + Arrays.toString(arr２));
		
		int arr3[] = new int[]{10,9,8,7,6,5,4,3,2,1};
		InsertSort s3 = new InsertSort();
		s3.insertSort(arr3);
		System.out.println("插入排序结果：" + Arrays.toString(arr3));
		
		int arr4[] = new int[]{10,9,8,7,6,5,4,3,2,1};
		ShellSort s4 = new ShellSort();
		s4.shellSort(arr4);
		System.out.println("希尔排序结果：" + Arrays.toString(arr4));
		
		int arr5[] = new int[]{10,9,8,7,6,5,4,3,2,1};
		MergeSort s5 = new MergeSort();
		s5.mergeSort(arr5);
		System.out.println("归并排序结果：" + Arrays.toString(arr5));
		
		int arr6[] = new int[]{10,9,8,7,6,5,4,3,2,1};
		MergeSort s6 = new MergeSort();
		s6.mergeSortBU(arr6);
		System.out.println("非递归方式归并排序结果：" + Arrays.toString(arr6));
		
		int arr7[] = new int[]{10,9,8,7,6,5,4,3,2,1};
		QuickSort s7 = new QuickSort();
		s7.quickSort(arr7);
		System.out.println("快速排序结果：" + Arrays.toString(arr7));
		
		int arr8[] = new int[]{10,9,8,7,6,5,4,3,2,1};
		QuickSort3Ways s8 = new QuickSort3Ways();
		s8.quickSort3Ways(arr8);
		System.out.println("三路快排结果：" + Arrays.toString(arr8));
	}

}
