package com.practice.leetcode;

import java.util.LinkedHashMap;

public class twoSums2 {
	 public int[] twoSum(int[] numbers, int target) {
	        LinkedHashMap<Integer,Integer> map=new LinkedHashMap<Integer,Integer>();
	        for(int i=0;i<numbers.length;i++){
	            map.put(numbers[i],i);
	        }
	        int[] indices=new int[2];
	        for(int i=0;i<numbers.length;i++){
	            int find=target-numbers[i];
	            if(map.get(find)!=null){
	                indices[0]=i;
	                indices[1]=map.get(find);
	                break;
	            }
	        }
	        return indices;
	    }
	 
	 public static void main(String[]args){
		 System.out.println("started");
		 twoSums2 s=new twoSums2();
		 int[]num=new int[]{1,2,3,4,5,10,11,12,13,14,15,20,22,24,26,28,34,55};
		 int[] res=s.twoSum(num, 70);
		 System.out.println(res[0]+"  "+ res[1]);
	 }
}
