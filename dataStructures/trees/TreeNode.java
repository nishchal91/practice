package com.practice.dataStructures.trees;

public class TreeNode {
	
	int key;
	TreeNode left;	
	TreeNode right;
	
	public TreeNode(int key){
		this.key=key;
		left=right=null;
	}
	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}
	
	public void setLeft(int key){
		this.left=new TreeNode(key);
	}

	public void setRight(int key){
		this.right=new TreeNode(key);
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}
	public int getKey() {
		return key;
	}
	
	

}
