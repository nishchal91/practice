package com.practice.sorting;

public class BubbleSort {
	
	public void bubbleSort(int[] array){
		int length=array.length;
		for(int i=0;i<length-1;i++){
			boolean swap=false;
			for(int j=0;j<length-i-1;j++){
				if(array[j]>array[j+1]){
					int temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					swap=true;
				}
			}
			if(swap==false){
				break;
			}
		}
	}

	public static void main(String[] args) {
		BubbleSort sort=new BubbleSort();
		int[] arr={6,1,2,3,4,5};
		sort.bubbleSort(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

}
