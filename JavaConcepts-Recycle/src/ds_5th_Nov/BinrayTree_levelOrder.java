package ds_5th_Nov;

import java.util.LinkedList;
import java.util.Queue;
/**
 * 
 * @author Hariom Yadav - Nov 5, 2019
 *
 */
//ds
//node 

//use of ds
class LevelOrder{
	//know some
	Node root;
	
	//does some
	void printLevel(){
		Queue<Node> qu = new LinkedList<Node>();
		qu.add(root);
		
		while(!qu.isEmpty()) {
			Node temp = qu.poll();//return + removes
			System.out.print(temp.data+" ");
			
			if(temp.left != null) {
				qu.add(temp.left);
			}
			if(temp.right != null) {
				qu.add(temp.right);
			}
		}
		System.out.println("");
		
	}
	
}

public class BinrayTree_levelOrder {
	public static void main(String[] args) {
		LevelOrder obj = new LevelOrder();
		obj.root = new Node(1);
		obj.root.left = new Node(2);
		obj.root.right = new Node(3);
		obj.printLevel();
		obj.root.left.left = new Node(4);
		obj.root.left.right = new Node(5);
		obj.root.right.left = new Node(6);
		obj.root.right.right = new Node(7);
		
		obj.printLevel();
		
		
		
		
	}
}
