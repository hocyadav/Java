package ds_collection_n_LRU_23rd_nov;

import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
/**
 * 
 * @author Hariom Yadav - Nov 23, 2019
 *
 */
//data structure used - deque + set or hashmap
class Lru{
	Deque<Integer> dq ;//element present in DQ takes n time
	HashSet<Integer> set;//only to make element present in DQ or not
	int size;
	
	public Lru(int s){
		size = s;
		dq = new LinkedList<>();
		set = new HashSet<>();
	}
	
	public void refer(int key) {
		if(! set.contains(key)) {//key not present in cache
			if(dq.size() == size) {
				set.remove(dq.removeLast());
			}
			dq.addFirst(key);
			set.add(key);
		}else {//key present in cache
			//get key location
			if(dq.getFirst() != key) {
				Iterator<Integer> it = dq.iterator();
				while(it.hasNext()) {
					if(it.next() == key) {
						it.remove();
						break;
					}
				}
				//dq.remove(index);//not removing that element from list - since this is DQ not array
				dq.addFirst(key);
				//set.add(key);
			}
		}
	}
	
	public void print() {
		Iterator<Integer> it = dq.iterator();
		System.out.print("LRU cache : ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
	}
	
}


public class LruCacheImpl {
	public static void main(String[] args) {
		Lru obj = new Lru(4);
		obj.refer(11); obj.print();
		obj.refer(11); obj.print();
		obj.refer(11); obj.print();
		obj.refer(11); obj.print();
		
		obj.refer(22); obj.print();
		obj.refer(22); obj.print();
		obj.refer(22); obj.print();
		
		obj.refer(33); obj.print();
		obj.refer(33); obj.print();
		obj.refer(33); obj.print();
		
		obj.refer(22); obj.print();
		obj.refer(22); obj.print();
		obj.refer(22); obj.print();
		
		obj.refer(11); obj.print();
		obj.refer(11); obj.print();
		
		obj.refer(11); obj.print();
		obj.refer(11); obj.print();
		
		obj.refer(5); obj.print();
		obj.refer(11); obj.print();
		
		obj.refer(6); obj.print();
		obj.refer(11); obj.print();
		
	}

}
