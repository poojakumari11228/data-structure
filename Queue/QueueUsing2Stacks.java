package DataStructure.Queue;

import java.util.Stack;

public class QueueUsing2Stacks<T> {

	Stack<T> newStack = new Stack<>();
	Stack<T> oldStack = new Stack<>();

	private void push(T obj) {
		newStack.push(obj);
	}

	private T pop() {
		shiftNewToOldStack();
		return oldStack.pop();
	}

	private void shiftNewToOldStack() {
		if (oldStack.isEmpty()) {
			while (!newStack.isEmpty()) {
				oldStack.push(newStack.pop());
			}
		}
	}

	public static void main(String[] args) {
		QueueUsing2Stacks<Integer> q = new QueueUsing2Stacks<>();
		q.push(1);
		q.push(2);
		q.push(3);
		q.push(4);
		q.push(5);
		
//		 FIFO 
		
		System.err.println(q.pop());	//1
		System.err.println(q.pop());	//2
		
		q.push(6);
		q.push(7);
		q.push(8);
		
		System.err.println(q.pop());
		System.err.println(q.pop());
		System.err.println(q.pop());
		
		
		System.err.println(q.pop());
		System.err.println(q.pop());
		System.err.println(q.pop());
		
	}
}
