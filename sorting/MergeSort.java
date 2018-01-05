package com.practice.sorting;

public class MergeSort {
	
	public void mergeSort(int[] array,int leftIndex,int rightIndex){
		if(leftIndex<rightIndex){
			int middleIndex=(leftIndex+rightIndex)/2;
			mergeSort(array, leftIndex, middleIndex);
			mergeSort(array, middleIndex+1, rightIndex);
			merge(array, leftIndex, middleIndex, rightIndex);
		}
	}
	
	public void merge(int[]array,int leftIndex,int middleIndex,int rightIndex){
		int a1=middleIndex-leftIndex+1;
		int a2=rightIndex-middleIndex;
		int[] leftArr=new int[a1];
		int[] rightArr=new int[a2];
		for(int i=0;i<a1;i++){
			leftArr[i]=array[leftIndex+i];
		}
		for(int i=0;i<a2;i++){
			rightArr[i]=array[middleIndex+1+i];
		}
		int i=0,j=0;
		int k =leftIndex;
		while(i<a1 && j<a2){
			if(leftArr[i]<=rightArr[j]){
				array[k]=leftArr[i];
				i++;
			}else{
				array[k]=rightArr[j];
				j++;
			}
			k++;
		}
		
		while(i<a1){
			array[k]=leftArr[i];
			i++;
			k++;
		}
		
		while(j<a2){
			array[k]=rightArr[j];
			j++;
			k++;
		}
		
		
	}
	public static void main(String[] args) {
		MergeSort sort=new MergeSort();
		int[] array={2,5,1,3,7,4,8,10,15,11,9};
		sort.mergeSort(array, 0, array.length-1);
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}
