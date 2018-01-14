package com.practice.ctci.trees;

import com.practice.dataStructures.trees.TreeNode;

public class MinimalTree {
	
	public TreeNode createMinimalBST(int[] arr){
		return createMinimalBST(arr,0,arr.length-1);		
	}
	
	public TreeNode createMinimalBST(int arr[],int startIndex,int endIndex){
		if(endIndex<startIndex)return null;		
		int midIndex=(startIndex+endIndex)/2;
		TreeNode n=new TreeNode(arr[midIndex]);
		n.setLeft(createMinimalBST(arr,startIndex,midIndex-1));
		n.setRight(createMinimalBST(arr, midIndex+1, endIndex));
		return n;
	}
	
	public void printPreOrder(TreeNode n){
		if(n!=null){
			System.out.println(n.getKey());
			printPreOrder(n.getLeft());
			printPreOrder(n.getRight());
		}
	}

	public static void main(String[] args) {
		MinimalTree m=new MinimalTree();
		int sortedArray[]=new int[]{3,4,5,6,7,8,9};
		TreeNode minTree=m.createMinimalBST(sortedArray);
		m.printPreOrder(minTree);
		//System.out.println(minTree.getRight().getKey());
	}

}
