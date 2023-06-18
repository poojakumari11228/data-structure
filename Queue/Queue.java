package DataStructure.Queue;

public class Queue {

	private static class Node {

		private int data;
		private Node next;

		public Node(int data) {
			this.data = data;
		}
	}

	private Node head;
	private Node tail;

	public boolean isEmpty() {
		return head == null;
	}

	public void add(int data) {
		Node n = new Node(data);
		if (tail != null) {
			tail.next = n;
		}

		tail = n;

		if (head == null)
			head = n;
	}

	public int remove() {
		if (head != null) {
			Node n = head;
			head = head.next;
			return n.data;
		} else
			tail = null; // if head is null, queue is null so set tail also null
		return 0;
	}

	public int peek() {
		return head.data;
	}

	public static void main(String[] args) {
		Queue q = new Queue();
		q.add(1);
		q.add(2);
		q.remove();
		q.add(3);
		q.add(4);

		System.out.println(q.peek());

	}
}
