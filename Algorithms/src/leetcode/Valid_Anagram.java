package leetcode;

import java.util.Arrays;

public class Valid_Anagram {

	/*Given two strings s and t, write a function to determine if t is an anagram of s.

	For example,
	s = "anagram", t = "nagaram", return true.
	s = "rat", t = "car", return false.*/
	
	public class Solution {
	    public boolean isAnagram(String s, String t) {
	        char[] word1=s.toCharArray();
	        char[] word2=t.toCharArray();
	        
	        Arrays.sort(word1);
	        Arrays.sort(word2);
	        
	        return String.valueOf(word1).equals(String.valueOf(word2));
	    }
	}
	
	
}
