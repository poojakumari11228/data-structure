package DataStructure.Tree;

public class Node {

	private Node left, right;
	private int data;

	public Node(int data) {
		this.data = data;
	}

	public void insert(int value) {
		if (value <= data) {
			if (left == null) {
				left = new Node(value);
			} else {
				left.insert(value);
			}
		} else {
			if (right == null) {
				right = new Node(value);
			} else {
				right.insert(value);
			}
		}
	}

	public boolean contains(int value) {
		if (data == value)
			return true;
		else if (value <= data) {
			if (left == null)
				return false;
			else {
				return left.contains(value);
			}
		} else {
			if (right == null)
				return false;
			else {
				return right.contains(value);
			}
		}
	}

	public void traverceInorder() {
		if (left != null)
			left.traverceInorder();
		System.out.println(data);
		if (right != null)
			right.traverceInorder();
	}

	// height of a binary tree:
	/*
	 * total nmbr of edges of the longest path from the leaf node to the root node
	 */

	public int BTHeight(Node root) {

		if (root == null)
			return 0;

		int leftHeight = BTHeight(root.left);
		int rightHeight = BTHeight(root.right);

		return max(leftHeight, rightHeight) + 1;

	}

	/*
	 * public int BTDepth(Node root, int data) {
	 * 
	 * int d = 0; if (root == null) return 0;
	 * 
	 * if (root.data != data && root.left != null) { d = BTDepth(root.left, data);
	 * 
	 * }
	 * 
	 * if (root.data != data && root.right != null) { d = BTDepth(root.right, data);
	 * 
	 * }
	 * 
	 * if (root.data == data) return d + 1;
	 * 
	 * return d;
	 * 
	 * }
	 */

	// correct approach
	static int findDepth(Node root, int x) {

		// Base case
		if (root == null)
			return -1;

		// Initialize distance as -1
		int dist = -1;

		// Check if x is current node=
		if ((root.data == x) ||

		// Otherwise, check if x is
		// present in the left subtree
				(dist = findDepth(root.left, x)) >= 0 ||

				// Otherwise, check if x is
				// present in the right subtree
				(dist = findDepth(root.right, x)) >= 0)

			// Return depth of the node
			return dist + 1;

		return dist;
	}

	private int max(int leftHeight, int rightHeight) {
		if (leftHeight > rightHeight)
			return leftHeight;
		else
			return rightHeight;
	}

	public BalanceTreeResponse isBalancedTree(Node root) {

		if (root == null)
			return new BalanceTreeResponse(true, -1);

		BalanceTreeResponse LeftRes = isBalancedTree(root.left);
		BalanceTreeResponse RightRes = isBalancedTree(root.right);

		int height = Math.max(LeftRes.getHeight(), RightRes.getHeight()) + 1;
		boolean isBalanaced = Math.abs(LeftRes.getHeight() - RightRes.getHeight()) > 1 ? false : (
				!LeftRes.isBalanced || !RightRes.isBalanced) ? false : true;

		return new BalanceTreeResponse(isBalanaced, height);

	}

	public class BalanceTreeResponse {

		boolean isBalanced;
		int height;

		BalanceTreeResponse(boolean isBalanced, int height) {
			this.isBalanced = isBalanced;
			this.height = height;
		}

		public boolean isBalanced() {
			return this.isBalanced;
		}

		public int getHeight() {
			return this.height;
		}

		@Override
		public String toString() {
			return "BalanceTreeResponse [isBalanced=" + isBalanced + ", height=" + height + "]";
		}

	}

	public static void main(String args[]) {
		Node n = new Node(6);	// it will be inserted in root
		n.insert(3);			// as 3<=6 , so it will insert in left node
		n.insert(10);			// as 10>6 , so it will insert in right node
		n.insert(2);
		n.insert(1);
		n.insert(9);
		n.insert(12);
		n.insert(11);
		
		
		
		n.traverceInorder();
		
		System.out.println(n.BTHeight(n));

		System.out.println("d: "+n.findDepth(n, 11));

		// for isBalanced tree
//		Node n = new Node(6); 
//		n.insert(3); 
//		n.insert(10); 
//		n.insert(2);
//		n.insert(1);
//
//		System.out.println(n.isBalancedTree(n));

		// for isBalanced tree
//		Node n = new Node(6);
//		n.insert(3);
//		n.insert(10);
//		n.insert(2);
//		n.insert(4);
//		n.insert(12);
//		n.insert(11);
//
//		System.out.println(n.isBalancedTree(n));

	}
}
