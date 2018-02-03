package com.practice.ctci.ArraysAndStrings;

public class OneAway {
	
	public boolean checkOneEdit(String input1,String input2){
		if(input1.length()==input2.length()){
			boolean foundDiff=false;
			for(int i=0;i<input1.length();i++){
				if(input1.charAt(i)!=input2.charAt(i)){
					if(foundDiff)return false;
					foundDiff=true;
				}
			}
			return true;
		}
		else{
			String shorterString,longerString;
			if(input1.length()+1==input2.length()){
				shorterString=input1;
				longerString=input2;
			}else if(input2.length()+1==input1.length()){
				shorterString=input2;
				longerString=input1;
			}
			else return false;
			
			int index1=0,index2=0;
			while(index1<shorterString.length() && index2 < longerString.length()){
				if(shorterString.charAt(index1)!=longerString.charAt(index2)){
					if(index1!=index2)return false;
					index2++;
				}
				else{
					index1++;
					index2++;
				}
			}
			
			return true;
		}
	}

	public static void main(String[] args) {
		OneAway oneEdit=new OneAway();
		System.out.println(oneEdit.checkOneEdit("pale", "bale"));
	}

}
