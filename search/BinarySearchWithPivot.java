//Search an element in a sorted and rotated array
package com.practice.search;

public class BinarySearchWithPivot {

	public int SearchWithPivot(int[]array, int leftIndex,int rightIndex,int numToSearch){
		
		if(leftIndex>rightIndex)return -1;
		
		int middleIndex=(leftIndex+rightIndex)/2;
		
		if(array[middleIndex]==numToSearch)return middleIndex;
		//left to middle sorted
		if(array[leftIndex]<=array[middleIndex]){
			if(array[leftIndex]<=numToSearch && numToSearch<=array[middleIndex])
				return SearchWithPivot(array, leftIndex, middleIndex-1, numToSearch);
			return SearchWithPivot(array, middleIndex+1, rightIndex, numToSearch);
		}
		// left to middle not sorted , so middle to right will be sorted
		if(numToSearch>=array[middleIndex] && numToSearch<=array[rightIndex])
			return SearchWithPivot(array, middleIndex+1, rightIndex, numToSearch);
		return SearchWithPivot(array, leftIndex, middleIndex-1, numToSearch);
	}
	public static void main(String[] args) {
		BinarySearchWithPivot search=new BinarySearchWithPivot();
		int[] array={17,18,1,2,3,4,5};
		int num=3;
		int index= search.SearchWithPivot(array, 0, array.length-1, num);
		if(index!=-1){
			System.out.println(num+" is present at position : "+index);
		}
		else{
			System.out.println("Element not found");
		}
	}

}
