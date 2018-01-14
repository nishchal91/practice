package com.practice.ctci.graphs;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

import com.practice.dataStructures.graphs.Graph;

// to find whether there is a route between two nodes
public class RouteBetweenNodes {
	
	public boolean isRoutePresent(Graph g,int startingPoint,int endPoint){
		Queue<Integer> queue=new LinkedList<Integer>();
		boolean visited[]=new boolean[g.getNumberOfVertices()];
		visited[startingPoint]=true;
		queue.add(startingPoint);
		
		while(!queue.isEmpty()){
			startingPoint=queue.poll();
			System.out.println(startingPoint+" ");
			if(startingPoint==endPoint)return true;
			Iterator<Integer>i= g.getAdjArray()[startingPoint].listIterator();
			while(i.hasNext()){
				int n=i.next();
				if(!visited[n]){
					visited[n]=true;
					queue.add(n);
				}
			}
		}
		return false;
		
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
		RouteBetweenNodes route=new RouteBetweenNodes();
		boolean isRoutePresent=false;
		isRoutePresent=route.isRoutePresent(g, 3, 1);
		System.out.println("Route present :"+isRoutePresent);
	}

}
