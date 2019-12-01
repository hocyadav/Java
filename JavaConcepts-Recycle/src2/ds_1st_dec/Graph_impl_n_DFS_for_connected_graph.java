package ds_1st_dec;

import java.util.Iterator;
import java.util.LinkedList;

//data structure
class Graph{
	//know something
	int vertexSize;
	LinkedList<Integer>[] adjList;
	
	//does something
	public Graph(int size) {
		vertexSize = size;
		adjList = new LinkedList[vertexSize];//all vertex
		
		for(int i=0; i<vertexSize; i++)//in all vertex - declaring list to store connected vertex
			adjList[i] = new LinkedList<Integer>();

	}
	
	public void addEdge(int givenVertex, int connectedVerted) {
		adjList[givenVertex].add(connectedVerted);
	}
	
	public void DFS(int vertex){
		boolean[] visited = new boolean[vertexSize];
		DFSUtil(vertex, visited);
		
	}

	private void DFSUtil(int vertex, boolean[] visited) {
		//1. visited vertex - true
		visited[vertex] = true;
		//2. print vertex
		System.out.print(vertex+" ");
		//3. all connected vertex - call DFSUtil
		
		Iterator<Integer> it = adjList[vertex].iterator();
		while(it.hasNext()) {
			//get connected vertex
			int n = it.next();
			if(! visited[n]) {//if not visited - then call DFSUtil
				DFSUtil(n, visited);
			}
		}
		
	}
}

public class Graph_impl_n_DFS_for_connected_graph {
	public static void main(String[] args) {
		//graph obj
		Graph obj = new Graph(4);
		
		//create graph
		obj.addEdge(0, 1); obj.addEdge(0, 2);  
		obj.addEdge(1, 2);
		obj.addEdge(2, 0); obj.addEdge(2, 3);
		obj.addEdge(3, 3);
		//obj.addEdge(1, 4);//TODO : we cant add 5th element no check for overflow present
		
		//call DFS - stack
		obj.DFS(2);
	}
}
