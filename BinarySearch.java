package com.practice;

public class BinarySearch {

	public int binarySearch(int[] array, int leftIndex,int rightIndex,int numToSearch){
		if(rightIndex>=leftIndex){
			int middleIndex= (leftIndex + rightIndex)/2;
			if(array[middleIndex]==numToSearch)return middleIndex;
			if(array[middleIndex]>numToSearch){
				return binarySearch(array,leftIndex,middleIndex-1,numToSearch);
			}
			return binarySearch(array,middleIndex+1,rightIndex,numToSearch);
		}
		return -1;
	}
	
	public static void main(String[] args){
		int[] num={2,4,6,8,10,67};
		BinarySearch search=new BinarySearch();
		int x=10;
		int index = search.binarySearch(num, 0, num.length-1, x);
		if(index!=-1){
			System.out.println(x+" is present at position :"+index);
		}
		else{
			System.out.println("Element not found");
		}
	}


}
