package collection_PQ_15th_nov;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class PriorityQueue_SortedSet {

	public static void main(String[] args) {
		SortedSet<String> sset = new TreeSet<String>();
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(22);
		list.add(2);
		System.out.println(list);
		Collections.sort(list);//this will sort only primitive data type - https://www.youtube.com/watch?v=oAp4GYprVHM
		//sort will only take that obj of class that has implemented Comparable interface
		//since Integer, String all these primitive wrapper class has implemented this interface and internally written unimplemented class
		//SO to send our obj , our class 1st need to implement Comparable interface then write logic for sorting in unimplemented method compareTo()
		System.out.println(list);
		
	}

}
