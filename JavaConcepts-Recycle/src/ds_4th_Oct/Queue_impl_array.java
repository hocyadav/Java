package ds_4th_Oct;
/**
 * 
 * @author Hariom Yadav - Nov 4, 2019
 *
 */
//data srtructure 
class Queue{
	//know something
	int front, rear;
	int size;
	int[] queue;
	
	//does something
	Queue(int x){//memory allocate , initialize
		front = 0;
		rear =0;
		size = x;
		queue = new int[size];
	}
	
	void enQ(int v) {//rear++ and add
		if(rear == size) {
			System.out.println("overflow");
			return;
		}
		queue[rear++] = v;
	}
	
	void deQ() {//--rear , move 1 step left
		if(front == rear) {
			System.out.println("Underflow - empty");
			return;
		}
		for(int i=0;i<rear-1;i++) {
			queue[i] = queue[i+1];
		}
		--rear;
	}
	
	void print() {
		System.out.print("Queue : ");
		for(int i=0; i<rear;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println("");
	}
}


public class Queue_impl_array {
	public static void main(String[] args) {
		Queue obj = new Queue(4);
		obj.deQ();
		obj.enQ(1);obj.print();
		obj.enQ(2);obj.print();
		obj.enQ(3);obj.print();
		obj.enQ(4);obj.print();
		obj.enQ(1);obj.print();//overflow
		obj.deQ(); obj.print();
	}
}
/**
Underflow - empty
Queue : 1 
Queue : 1 2 
Queue : 1 2 3 
Queue : 1 2 3 4 
overflow
Queue : 1 2 3 4 
Queue : 2 3 4 
 */
