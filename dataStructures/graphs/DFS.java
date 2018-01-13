package com.practice.dataStructures.graphs;

import java.util.Iterator;

public class DFS {
	
	public void DFSearch(Graph g,int startingPoint){
		boolean visited[]=new boolean[g.getNumberOfVertices()];		
		DF(g,startingPoint,visited);
	}
	
	public void DF(Graph g,int startingPoint, boolean[] visited){
		System.out.println(startingPoint+" ");
		visited[startingPoint]=true;
		Iterator<Integer> i= g.getAdjArray()[startingPoint].listIterator();
		while(i.hasNext()){
			int n=i.next();
			if(!visited[n]){
				DF(g,n,visited);
			}
		}
	}
	public static void main(String[] args) {
		Graph g=new Graph(6);
		g.addEdge(0, 1);
		g.addEdge(0, 4);
		g.addEdge(0,5);
		g.addEdge(1, 4);
		g.addEdge(1, 3);
		g.addEdge(2, 1);
		g.addEdge(3, 2);
		g.addEdge(3, 4);
		DFS search=new DFS();
		search.DFSearch(g, 0);

	}

}
