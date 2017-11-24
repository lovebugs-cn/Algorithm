package algorithm;

import java.util.LinkedList;

//两个队列实现一个栈
public class QueuesToStack {
	
	LinkedList<Integer> queue1 = new LinkedList<Integer>();
	LinkedList<Integer> queue2 = new LinkedList<Integer>();
	
	//入栈
	public void pushStack(int n) {
		queue1.addLast(n);
	}
	
	//出栈，必须是非空的栈才能出栈
	public int popStack() {
		if(queue1.size() + queue2.size() != 0) {
			
			//把非空队列的n-1个压入空对列，剩的第n个出队,总有一个队列为空。
			if(queue1.isEmpty()) {
				while(queue2.size() > 1) {
					queue1.addLast(queue2.removeFirst());
				}
				return queue2.removeFirst();
			}else {
				while(queue1.size() > 1) {
					queue2.addLast(queue1.removeFirst());
				}
				return queue1.removeFirst();
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		QueuesToStack stack = new QueuesToStack();
		stack.pushStack(1);
		stack.pushStack(2);
		stack.pushStack(3);
		System.out.println(stack.popStack());
		System.out.println(stack.popStack());
		stack.pushStack(4);
		stack.pushStack(5);
		System.out.println(stack.popStack());
		System.out.println(stack.popStack());
		System.out.println(stack.popStack());
		System.out.println(stack.popStack());
	}
	
}
