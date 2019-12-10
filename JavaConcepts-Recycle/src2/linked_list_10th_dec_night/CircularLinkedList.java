package linked_list_10th_dec_night;
/**
 * 
 * @author Hariom Yadav | 10-Dec-2019
 *
 */


//ds
class CircularLL{
	
	public static class Node{
		int data;
		Node next;
		
		public Node(int v) {
			data = v;
		}
	}
	
	
	Node last;
	
	public void addEmpty(int v) {
		last = rec_addEmpty(last, v);
	}

	private Node rec_addEmpty(Node last, int v) {
		if(last != null) return last;
		
		Node nn = new Node(v);
		
		last = nn;
		last.next = last;
		
		return last;
	}
	
	public void addFirst(int v) {
		last = rec_addFirst(last, v);
	}

	private Node rec_addFirst(Node last, int v) {
		if(last == null)
			return rec_addEmpty(last, v);
		
		Node nn = new Node(v);
		//connection
		nn.next = last.next;
		last.next = nn;
		
		return last;
	}
	
	public void addLast(int v) {
		last = rec_addLast(last, v);
	}

	private Node rec_addLast(Node last, int v) {
		if(last == null)
			return rec_addEmpty(last, v);
		
		Node nn = new Node(v);
		nn.next = last.next;
		last.next = nn;
		last = nn;
		return last;
	}
	
	public void addAfter(int p, int v) {
		last = rec_addAfter(last, p, v);
	}
	
	private Node rec_addAfter(Node last, int p, int v) {
		if(last == null)
			return null;
		
		Node nn = new Node(v);
		
		Node pnode = last.next;
		do {
			if(pnode.data == p) {//found : add + return
				nn.next = pnode.next;
				pnode.next = nn;
				
				if(pnode == last)
					last = pnode;
				return last;
			}else
				pnode = pnode.next;
		}while(pnode != last);
		
		return last;
	}

	public void print() {
		System.out.print("CLL : ");
		
		if(last == null) {
			System.out.println();
			return;
		}
		
		Node t = last.next;
		while(t != last) {
			System.out.print(t.data+" ");
			t = t.next;
		}
		System.out.print(t.data);
		System.out.println();
	}
	
	
}


public class CircularLinkedList {
	public static void main(String[] args) {
		CircularLL obj = new CircularLL();
		obj.print();
		obj.addEmpty(9); obj.print();
		obj.addFirst(1);obj.print();
		obj.addFirst(2);obj.print();
		obj.addLast(4);obj.print();
		obj.addAfter(1, 34); obj.print();
		
	}
}
