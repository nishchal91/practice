/*
You are given two non-empty linked lists representing two non-negative integers. 
The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */

package practice.practice;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;


public class AddLinkedList {
	 private Node l3;

	public Node addTwoNumbers(Node l1, Node l2) {
	     l3 = null; 
	     int carry=0;
		 while(l1!=null||l2!=null){
	    	 int total=0;
			 if(l1==null){
				  total=l2.data+carry;
				 carry=0;
				 l2=l2.next;
				// Node n= new Node(total);
	    	  }else if(l2==null){
	    		 total=l1.data+carry;
	    		  carry=0;
	    		  l1=l1.next;
				 // Node n= new Node(total);
	    	  }
	    	  else{
	    		  total=l1.data+l2.data+carry;
	    		  carry=0;
	    		  l1=l1.next;
	    		  l2=l2.next;
	    		  
	    	  }
			 if(total>=10){
				 total=total%10;
				 carry=1;
				 
			 }
			
			 if(l3==null){
				 l3=new Node(total);
				 
			 }else{
				 Node n=new Node(total);
				 Node last=l3;
				 while(last.next!=null){
					last=last.next;
				 }
				 last.next=n;
				}
			 
			 
			 
	      }
		 if(l1==null&&l2==null&&carry==1){
			 Node n1=new Node(1);
			 Node last1=l3;
			 while(last1.next!=null){
				last1=last1.next;
			 }
			 last1.next=n1;
			
		 }
	 
		 return l3;
	    }
	 public void printList(Node n) {
			while (n != null) {
				System.out.print(n.data + " ");
				n = n.next;
			}
			System.out.println();		
		}
	 
	 public int majorityElement(int[] nums) {
		 int majorityElementNumber=0;
	        int length= nums.length;
	        double d= length/2;
	        int majorityElementFrequency = (int)Math.floor(d);
	        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
	        if(length==1 || length==2){
	        	majorityElementNumber=nums[0];
	        }else{
	        for(int i=0;i<length;i++){
	            if(map.containsKey(nums[i])){
	                int newVal=map.get(nums[i])+1;
	                if(newVal > majorityElementFrequency ){
	                    majorityElementNumber=nums[i] ;
	                    break;
	                
	                }
	                map.put(nums[i],newVal);
	            }else{
	                map.put(nums[i],1);
	            }
	        }
	        }
	        return majorityElementNumber;
	    }
	 public int firstUniqChar(String s) {
	        HashMap<Character,Integer>map=new HashMap<Character,Integer>();
	        for(int i=0;i<s.length();i++){
	            char key=s.charAt(i);
	            if(map.containsKey(key)){
	                map.put(key,map.get(key)+1);
	            }
	            else{
	                map.put(key,1);
	            }
	        }
	        int index=-1;
	        for(int i=0;i<s.length();i++){
	            if(map.get(s.charAt(i))==1){
	                index=i;
	                break;
	            }
	        }
	        return index;
	    }

	 public static void main(String args[]){
		 AddLinkedList adder=new AddLinkedList();
		 int[] arr={0,0,0,0,0,0,1,1,1,1,1,1,2,1};
		 System.out.println(adder.majorityElement(arr));   
		 Node first=new Node(5);
		 String s="aabbccdd";
		 System.out.println(adder.firstUniqChar(s));
//		 Node second=new Node(4);
//		 Node third=new Node(3);
//		 first.next=second;
//		 second.next=third;
		 Node l2_first=new Node(5);	
//		 Node l2_second = new Node(6);
//		 Node l2_third = new Node(4);
//		 Node l2_fourth = new Node(9);
//		 Node l2_5 = new Node(9);
//		 Node l2_6 = new Node(9);
//		 Node l2_7 = new Node(9);
//		 Node l2_8 = new Node(9);
//		 Node l2_9 = new Node(9);
//		 Node l2_10 = new Node(9);
//		 l2_first.next=l2_second;
//		 l2_second.next=l2_third;
//		 l2_third.next=l2_fourth;
//		 l2_fourth.next=l2_5;
//		 l2_5.next=l2_6;
//		 l2_6.next=l2_7;
//		 l2_7.next=l2_8;
//		 l2_8.next=l2_9;
//		 l2_9.next=l2_10;
		 Node sum =adder.addTwoNumbers(first,l2_first);
//		 adder.printList(sum);
			
	 }
	
}
