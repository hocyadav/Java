package coding_11th_dec_night;

import java.util.HashSet;
/**
 * 
 * @author Hariom Yadav | 11-Dec-2019
 *
 */

class Node2{
	int data;
	Node2 next;
	public Node2(int data) {
		super();
		this.data = data;
	}
}


class LinkedList{
	Node2 head;
	
	public void addFist(int v) {
		Node2 nn = new Node2(v);
		if(head == null)
			head = nn;
		else {
			nn.next = head;
			head = nn;
		}
	}
	
	public boolean findLoopInLL() {
		//hashset : store one by one + check before storing
		HashSet<Node2> hs = new HashSet<>();
		Node2 t = head;
		while(t != null) {//traverse list
			if(hs.contains(t)) {
				return true;
			}
			hs.add(t);
			t = t.next;
		}
		return false;
	}

	
}


public class Find_Loop_in_a_Linked_List_using_HashSet {
	public static void main(String[] args) {
		LinkedList obj = new LinkedList();
		obj.addFist(20);
		obj.addFist(40);
		obj.addFist(15);
		obj.addFist(10);
		
		boolean b = obj.findLoopInLL();
		System.out.println(b);//false : loop not found
		
		//create loop for testing
		obj.head.next.next.next.next = obj.head; 
		
		boolean b2 = obj.findLoopInLL();
		System.out.println(b2);//true : loop not found
	}
}
/**
false
true
*/