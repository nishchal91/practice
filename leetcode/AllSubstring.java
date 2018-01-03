package com.practice.leetcode;

import java.util.LinkedHashMap;

public class AllSubstring {

	public void printAllSubstring(String s, int subStringLength){
		
	}
	
	public static int findSecondMinimum(int[] arr){
		int firstMin=Integer.MAX_VALUE,secondMin=Integer.MAX_VALUE;
		if(arr.length<2){
			System.out.println("No second minimum");
		}
		for(int i =0;i< arr.length;i++){
			if(arr[i]<firstMin){
				secondMin=firstMin;
				firstMin=arr[i];
			}
			else if(arr[i]<secondMin && arr[i]>firstMin){
				secondMin=arr[i];
			}
		}
		return secondMin;
	}
	
	public static void printAllUniqueCharacter(String s){
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<Character,Integer>();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(c!=' '){
			if(map.containsKey(c)){
				map.put(c,map.get(c)+1);
			}else{
				map.put(c, 1);
			}
			}
		}
		for(Character key:map.keySet()){
			if(map.get(key)==1)System.out.print(key);
		}
		
	}
	
	public static String reverseWords(String s) {
        String[] words=s.split(" ");
        StringBuilder reversedString=new StringBuilder();
        for(String word:words){
        	System.out.println(word.length());
            for(int i=word.length()-1;i>=0;i--){
            	
                
            	reversedString.append(word.charAt(i));
                
            }
            reversedString.append(" ");
        }
        
        return reversedString.toString().trim();
    }
	
	public static void main(String[] args){
		String s="Hello Geeks";
		AllSubstring.printAllUniqueCharacter(s);
		int[] arr={12,64,27,54,-1};
		System.out.println();
		System.out.println(AllSubstring.findSecondMinimum(arr));
		System.out.println(AllSubstring.reverseWords("Hello World"));
	}
}
