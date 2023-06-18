package DataStructure.Tree;

public class TreeTraversingAndRemoveItems {
	
	public static void main(String args[]) {

		TreeTraversingAndRemoveItems t = new TreeTraversingAndRemoveItems();
		// for isBalanced tree
		Node n = new Node(6);
		n.insert(3);
		n.insert(10);
		n.insert(2);
		n.insert(4);
		n.insert(12);
		n.insert(9);
		
		Node newNode = t.traverseAndRemove(new int[] {2,10}, n);
		newNode.traverceInorder();

	}
	
	
	static class Node {

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
		}
	public Node traverseAndRemove(int [] arr, Node root) {
		
		if(root==null)
			return root;
		
		Node left = traverseAndRemove(arr, root.left);
		Node right = traverseAndRemove(arr, root.right);
		
		if(arrContained(root.left, arr)) {
			root.left = null;
		}
		if(arrContained(root.right, arr)) {
			if(root.right.right!=null && root.right.left!=null && root.right.right.data>root.right.left.data)
			{
				Node prevLeft = root.right.left;
				root.right = root.right.right;
				root.right.left = prevLeft;
			}else {
				// 
			}
//			root.right = null;
		}
		
		return root;
		
	}
	private boolean arrContained(Node root, int[] arr) {
		for(int i : arr) {
			if(root!=null && i==root.data) {
				
				return true;
			}
		}
		return false;
	}

}
