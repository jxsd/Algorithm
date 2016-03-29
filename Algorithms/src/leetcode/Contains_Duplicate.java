package leetcode;

import java.util.HashSet;

public class Contains_Duplicate {

	/*Given an array of integers, find if the array contains any duplicates. Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
	*/
	
	public class Solution {
	    public boolean containsDuplicate(int[] nums) {
	        HashSet<Integer> set = new HashSet<Integer>();
	        for(int i=0;i<nums.length;i++){
	            if(!set.add(nums[i])) return true;
	        }
	        return false;
	        
	    }
	}
}
