package leetcode;

public class Excel_Sheet_Column_Title {

	/*1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB */
	
	
	public class Solution {
	    public String convertToTitle(int n) {
	        String result="";
	        while(n!=0){
	            char ch=(char)(((n-1)%26)+65);
	            n=(n-1)/26;
	            result=ch+result;
	        }
	        return result;
	    }
	}
	
}
