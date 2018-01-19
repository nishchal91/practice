package com.practice.ctci.ArraysAndStrings;

import java.util.HashMap;

public class checkPermutation {
	
	public boolean isPermuation(String input1,String input2){
		if(input1.length()!=input2.length())return false;
		// can also do the same using array as used in IsUnique	
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		for(char c:input1.toCharArray()){
			if(map.containsKey(c))map.put(c, map.get(c)+1);
			else map.put(c, 1);
		}
		
		for(char c:input2.toCharArray()){
			if(map.containsKey(c)){
				int val= map.get(c);
				if(val==0)return false;
				else map.put(c, val-1);
			}else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		checkPermutation permutation=new checkPermutation();
		System.out.println(permutation.isPermuation("aabbcdeff","fafecbabd"));
	}

}
