package practice;

import java.util.HashMap;

public class NextGreatestElement {
 
	
	public int[] nextGreaterElement(int[] nums1, int[] nums2) {
	        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
	        for(int i=0;i<nums1.length;i++){
	            map.put(nums1[i],-1);
	        }
	        int k;
	        for(int j=0;j<nums2.length;j++){
	            k=1;
	            if(j==nums2.length-1)k=-1;
	            else{
	            while(nums2[j]>nums2[j+k] && (j+k)<nums2.length-1){
	                k++;
	            }
	            }
	            if(j+k>=nums2.length-1 && nums2[j+k]<nums2[j])k=-1;
	            
	            if(map.containsKey(nums2[j])){
	            	if(k!=-1)map.put(nums2[j],nums2[j+k]);
	            	else map.put(nums2[j],-1);
	            }
	        }
	        
	        int[] res=new int[map.size()];
	        for(int l=0;l<nums1.length;l++){
	            res[l]=map.get(nums1[l]);
	        }
	        return res;
	    }
	
	public static void main(String args[]){
		NextGreatestElement n=new NextGreatestElement();
		int[]nums1={2,3,4,5,6,7,-1};
				
		int[]nums2={1,2,15,3,20,4,25,6,-2,27,8,7,10,5,16,-1,-2,-3,0};
				
		int[] res=n.nextGreaterElement(nums1, nums2);
		System.out.println("done");
	}
	
	
}
