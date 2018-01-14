package com.practice.dataStructures.graphs;

import java.util.LinkedList;

public class Graph {
	private final int numberOfVertices;
	private final LinkedList<Integer>[] adjArray;
	
	public Graph(int vertices){
		numberOfVertices=vertices;
		adjArray= new LinkedList[numberOfVertices];
		for(int i=0;i<numberOfVertices;i++){
			adjArray[i]=new LinkedList<Integer>();
		}
	}
	
	public void addEdge(int src,int dest){
		adjArray[src].add(dest);
	}
	
	public int getNumberOfVertices() {
		return numberOfVertices;
	}

	public LinkedList<Integer>[] getAdjArray() {
		return adjArray;
	}


	
}
