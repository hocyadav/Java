package ds6thOct;

import java.util.LinkedList;
import java.util.Queue;

//ds
class Node{
	int data;
	Node left, right;
	//does something
	Node(int v){
		data = v;
	}
}

class BST{
	//know some
	Node root;
	
	//does some
	
	public Node search(Node root, int key) {
		if(root == null || root.data == key) {
			return root;
		}else {
			if(key < root.data)
				return search(root.left, key);
			else
				return search(root.right, key);
		}
	}
	

	
	void inorder() {
		inrec(root);
	}
	private void inrec(Node rt) {
		if(rt == null) return;
		else {
			inrec(rt.left);
			System.out.print(rt.data+" ");
			inrec(rt.right);
		}
	}
	
	void preorder() {
		prec(root);
	}
	private void prec(Node ro2) {
		if(ro2 == null) return;
		else {
			System.out.print(ro2.data+" ");
			prec(ro2.left);
			prec(ro2.right);
			
		}
	}
	void postorder() {
		postRec(root);
	}
	private void postRec(Node pr) {
		if(pr == null) return;
		else {
			postRec(pr.left);
			postRec(pr.right);
			System.out.print(pr.data+" ");
		}
	}
	
	void LevelOrder() {
		//queue
		Queue<Node> qobj = new LinkedList<Node>();
		qobj.add(root);
		
		while(!qobj.isEmpty()) {
			Node temp = qobj.poll();
			System.out.print(temp.data+" ");
			
			if(temp.left != null)
				qobj.add(temp.left);
			if(temp.right != null)
				qobj.add(temp.right);
		}
		
	}
	
	void insert(int key) {//root = : since root will change 
		root = inrec(root, key);
		
	}
	private Node inrec(Node ri,int v) {//go left or right - base case create node and return
		
		if(ri == null) {
			ri = new Node(v);
			return ri;
		}
		if(v < ri.data) {
			ri.left = inrec(ri.left, v);
		}else {
			ri.right = inrec(ri.right, v);
		}
		return ri;
	}
	
	
}

public class BST_inPrePost_n_Level {
	public static void main(String[] args) {
		BST obj = new BST();
		obj.root = new Node(10);
		obj.root.left = new Node(5);
		obj.root.right = new Node(15);
		
		obj.inorder();
		System.out.println("");
		
		obj.preorder();
		System.out.println("");
		
		obj.postorder();
		System.out.println("");
		
		obj.LevelOrder();
		System.out.println("");
		
		obj.insert(4);
		obj.insert(16);
		obj.insert(6);
		System.out.println("");
		obj.LevelOrder();
		
		Node temp = obj.search(obj.root, 11);
		if(temp != null)
			System.out.println("found "+temp.data);
	}
}
