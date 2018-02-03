package com.practice.ctci.ArraysAndStrings;

public class IsUnique {
	
	public boolean isUnique(String input){
		int[] c= new int[128];
		
		for(char a:input.toCharArray()){
			if(c[a]>=1)return false;
			c[a]++;
		}
		return true;
	
	}
	
	
	public static void main(String[] args){
		IsUnique input=new IsUnique();
		System.out.println(input.isUnique("qwertyuiopasdfghjkl zxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM"));
	}
	
}
