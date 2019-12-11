package ds_11th_dec_night;
/**
 * 
 * @author Hariom Yadav | 11-Dec-2019
 *
 */

class Node{
	int data;
	Node left;
	Node right;
	public Node(int data) {
		super();
		this.data = data;
	}
}

class BST{
	Node root;
	
	public void TreeIsBstOrNot() {
		boolean b = rec_bstOrNot(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
		if(b)
			System.out.println("Binary Tree is BST");
		else
			System.out.println("Binary Tree is not BST");
	}

	private boolean rec_bstOrNot(Node root, int min, int max) {
		if(root == null)
			return true;
		if(root.data < min || root.data > max)
			return false;
		
		boolean left = rec_bstOrNot(root.left, min, root.data-1);
		boolean right = rec_bstOrNot(root.right, root.data+1, max);
		return left && right;
	}
}


public class BinaryTree_is_BST_or_Not {
		public static void main(String[] args) {
			BST tree = new BST();
			tree.root = new Node(4); 
	        tree.root.left = new Node(2); 
	        tree.root.right = new Node(5); 
	        tree.root.left.left = new Node(1); 
	        tree.root.left.right = new Node(3); 
	        tree.TreeIsBstOrNot();
	}
}
/**

Tree is BST

*/