package com.practice.ctci.ArraysAndStrings;

public class URLify {
	
	public String urlify(String input, int length){
		input=input.substring(0, length);
		input=input.replace(" ", "%20");
		return input;
	}
	// using character array
	
	public void urlifyChars(char[] input,int length){
		
		int spaceCount=0,i=0;
		
		for(i=0;i<length;i++){
			if(input[i]==' '){
				spaceCount++;
			}
		}
		int index= length + spaceCount*2; // each space is replaced with '%','2','0' , so additional 2 char required
		if(length<input.length)input[length]='\0';
		for(i=length-1;i>=0;i--){
			if(input[i]==' '){
				input[index-1]='0';
				input[index-2]='2';
				input[index-3]='%';
				index=index-3;
			}
			else{
				input[index-1]=input[i];
				index--;
			}
		}
		
		System.out.println(input);
		
		
	}
	
	
	public static void main(String[] args) {
		URLify url=new URLify();
		String input="Mr John Smith    ";
		int trueLength=13;
		System.out.println(url.urlify(input,trueLength));
		char[] chars=input.toCharArray();
		url.urlifyChars(chars, trueLength);
		
		
	
	}

}
