package com.practice.sorting;

public class InsertionSort {
	
	public void insertionSort(int[] array){
		for(int i=1;i<array.length;i++){
			int num=array[i];
			int j=i-1;
			while(j>=0 && array[j]> num){
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=num;
		}
	}
	public static void main(String[] args) {
		InsertionSort sort=new InsertionSort();
		int[] arr={2,9,3,1,4,6,5};
		sort.insertionSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
