package com.practice.ctci.trees;

import com.practice.dataStructures.trees.TreeNode;

public class ValidateBST {

	public boolean isValidBST(TreeNode root) {
        return checkBST(root,null,null);    
    }
    
    public boolean checkBST(TreeNode root, Integer min,Integer max){
        if(root==null)return true;
        
        if(min!=null && root.getKey()<=min || max!=null && root.getKey()>max){
			return false;
		}
		
		return checkBST(root.getLeft(),min,root.getKey())&& checkBST(root.getRight(),root.getKey(),max);
    }

	public static void main(String[] args) {
		TreeNode tree=new TreeNode(10);
		tree.setLeft(5);
		tree.setRight(15);
		tree.getLeft().setLeft(5);
		tree.getLeft().setRight(6);
		tree.getRight().setLeft(12);
		tree.getRight().setRight(17);
		ValidateBST checker= new ValidateBST();
		System.out.println(checker.isValidBST(tree)) ;


	}

}
