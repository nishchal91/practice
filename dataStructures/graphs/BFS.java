package com.practice.dataStructures.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class BFS{
	
	public void BFSearch(Graph g,int startingPoint){
		Queue<Integer> queue=new LinkedList<Integer>();
		boolean visited[]=new boolean[g.getNumberOfVertices()];
		visited[startingPoint]=true;
		queue.add(startingPoint);
		
		while(!queue.isEmpty()){
			startingPoint=queue.poll();
			System.out.println(startingPoint+" ");
			Iterator<Integer>i= g.getAdjArray()[startingPoint].listIterator();
			while(i.hasNext()){
				int n=i.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
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
		BFS search=new BFS();
		search.BFSearch(g, 0);
	}

}
