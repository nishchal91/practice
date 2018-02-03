package com.practice.ctci.ArraysAndStrings;

public class PalindromePermutation {
	
	public boolean checkPermutationPalindrome(String s){
		char[] chars=s.toLowerCase().toCharArray();
		int[] input=new int[26];
		for(char c:chars){
			if(c!=' '){
				input[c-97]++;
			}
		}
		int odd=0;
		for(int i:input){
			if(i%2!=0){
				if(odd==1)return false;
				odd++;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		PalindromePermutation permutation=new PalindromePermutation();
		System.out.println(permutation.checkPermutationPalindrome("Tact dCoad"));
	}

}
