package DataStructure.Stack;

public class Stack {

	public static class Node {
		private int data;
		private Node next;

		Node(int data) {
			this.data = data;
		}
	}

	private Node top;

	public void add(int data) {
		Node n = new Node(data);

		if (top != null) {
			n.next = top;
		}
		top = n;

	}

	public int pop() {
		int data = 0;
		if (top != null) {
			data = top.data;
			top = top.next;
		}
		return data;
	}

	public int peek() {
		if (top != null) {
			return top.data;
		}
		return 0;
	}

	public static void main(String args[]) {

		Stack s = new Stack();

		s.add(1);
		s.add(2);
		s.add(3);
		System.out.println("PEEK: " + s.peek());
		System.out.println("POP: " + s.pop());
		s.add(4);
		s.add(5);
		System.out.println("POP: " + s.pop());
		s.add(6);
		s.add(7);

	}

}
