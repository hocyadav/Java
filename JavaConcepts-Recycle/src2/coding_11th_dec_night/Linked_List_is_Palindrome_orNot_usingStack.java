package coding_11th_dec_night;

import java.util.Stack;
/**
 * 
 * @author Hariom Yadav | 11-Dec-2019
 * https://www.geeksforgeeks.org/function-to-check-if-a-singly-linked-list-is-palindrome/
 */

class LinkedList_P{
	Node2 head;
	Stack<Node2> stack = new Stack<Node2>();
	
	public void addFirstPlace(int v) {
		Node2 nn = new Node2(v);
		if(head == null)
			head = nn;
		else {
			nn.next = head;
			head = nn;
		}
	}
	
	public void checkPalindromeLL() {
		storeInStack();
		Node2 t = head;
		while(t != null) {//TODO : not working
			if(t != stack.peek()) {
				System.out.println("Not a palindrom");
				return;
			}else {
				stack.pop();//delete from stack
				t = t.next;
			}
		}
	}

	private void storeInStack() {
		//stack
		//Stack<Node2> stack = new Stack<Node2>();
		//put all LL into stack
		Node2 t = head;
		while(t != null) {
			stack.push(t);
			t = t.next;
		}
				
		System.out.println(stack);
				
	}
	
}

public class Linked_List_is_Palindrome_orNot_usingStack {
	public static void main(String[] args) {
		LinkedList_P obj = new LinkedList_P();
		obj.addFirstPlace(1);
		obj.addFirstPlace(2);
		obj.addFirstPlace(1);
		//obj.addFirst(1);
		obj.checkPalindromeLL();
		
	}
}
