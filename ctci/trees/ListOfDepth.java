package com.practice.ctci.trees;

import java.util.LinkedList;

import com.practice.dataStructures.trees.TreeNode;

public class ListOfDepth {
	LinkedList<Integer> lists[];
	
	@SuppressWarnings("unchecked")
	public LinkedList<Integer>[] createLinkedListAtEachLevel(TreeNode root){
		int height = getHeightOfTree(root);
		//ArrayList<LinkedList<Integer>> listOfLinkedLists = new ArrayList<>();
		lists =new LinkedList[height];
		for(int i=0;i<height;i++){
			lists[i]=new LinkedList<Integer>();
			createLinkedListsAtGivenLevel(root,i,i);
		}
		return lists;
	}
	
	public void createLinkedListsAtGivenLevel(TreeNode root, int level,int index){
		if(root==null)return;
		if(level==0){
			lists[index].add(root.getKey());
		}
		else if (level>0){
			createLinkedListsAtGivenLevel(root.getLeft(),level-1,index);
			createLinkedListsAtGivenLevel(root.getRight(), level-1, index);
		}
	}
	public int getHeightOfTree(TreeNode root){
		if(root==null)return 0;
		else{
			int lheight= getHeightOfTree(root.getLeft());
			int rheight= getHeightOfTree(root.getRight());
			
			if(lheight>rheight)return (lheight+1);
			else return rheight+1;
		}
		
	}
	public void printList(LinkedList<Integer> list) {
		System.out.println(list.toString());
	}
	
	
	public static void main(String[] args){
		TreeNode tree=new TreeNode(0);
		tree.setLeft(1);
		tree.setRight(2);
		tree.getLeft().setLeft(3);
		tree.getLeft().setRight(4);
		tree.getRight().setLeft(5);
		tree.getRight().setRight(6);
		ListOfDepth depthList=new ListOfDepth();
		LinkedList<Integer>[] listsOfDepth=depthList.createLinkedListAtEachLevel(tree);
		for(int i=0;i<listsOfDepth.length;i++){
			depthList.printList(listsOfDepth[i]);
		}
	}
}
