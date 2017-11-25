package algorithm;

public class Fibonacci {
	
	public static int getFibRecursive(int n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		return getFibRecursive(n - 1) + getFibRecursive(n - 2);
	}
	
	public static int getFibIterative(int n) {
		int[] result = new int[] {0,1};
		if (n < 2)
			return result[n];
		
		int a = 0;
		int b = 1;
		int res = 0;
		for(int i = 2; i <= n; i ++) {
			res = a + b;
			a = b;
			b = res;
		}
		return res;
	}
	
	public static int getFibArray(int n) {
		if(n == 0)
			return 0;
		else if(n == 1)
			return 1;
		else {
			int fibArray[] = new int[n + 1];
			fibArray[0] = 0;
			fibArray[1] = 1;
			for(int i = 2; i <= n; i++) {
				fibArray[i] = fibArray[i-2] + fibArray[i-1];
			}
			return fibArray[n];
		}
	}
	
	public static void main(String[] args) {
		System.out.println("递归方式：");
		for(int i = 0; i < 10; i ++)
			System.out.print(getFibRecursive(i) + " ");
		System.out.println();
		
		System.out.println("循环变量方式");
		for(int i = 0; i < 10; i ++)
			System.out.print(getFibIterative(i) + " ");
		System.out.println();
		
		System.out.println("循环数组方式");
		for(int i = 0; i < 10; i ++)
			System.out.print(getFibArray(i) + " ");
	}
}
