package collection_PQ_15th_nov;

import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * 
 * @author Hariom Yadav - Nov 15, 2019
 *
 */
public class PriorityQueue_Comparator_method {
	public static void main(String[] args) {
		PriorityQueue<String> pq =  new PriorityQueue<String>();
		pq.add("om"); pq.add("hari"); pq.add("yadav");
		System.out.println(pq);
		
		Comparator cobj = pq.comparator();
		System.out.println(cobj);//null means comparator will follow natural ordering sorting 
		
	}
}
