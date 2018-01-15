package com.practice.ctci.trees;

import com.practice.dataStructures.trees.TreeNode;

public class CheckBalanced {
	
	public boolean checkHeightAndBalance(TreeNode root){
		int checkHeight=getHeightOfTree(root);
		if(checkHeight<0)return false;
		else return true;
		
	}
	public int getHeightOfTree(TreeNode root){
		if(root==null)return 0;
		else{
			int lheight= getHeightOfTree(root.getLeft());
			int rheight= getHeightOfTree(root.getRight());
			if(lheight<0 || rheight<0)return -1;
			if(lheight-rheight>1 || rheight-lheight>1)return -1;
			if(lheight>rheight)return(lheight+1);
			else return rheight+1;
		}
		
	}

	public static void main(String[] args) {
		TreeNode tree=new TreeNode(0);
		tree.setLeft(1);
		tree.setRight(2);
		tree.getLeft().setLeft(3);
		tree.getLeft().setRight(4);
		tree.getRight().setLeft(5);
		tree.getRight().setRight(6);
		tree.getRight().getRight().setRight(7);
		tree.getRight().getRight().getRight().setRight(8);
		CheckBalanced checker= new CheckBalanced();
		System.out.println(checker.checkHeightAndBalance(tree)) ;

	}

}
