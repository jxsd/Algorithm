package leetcode;

public class Excel_Sheet_Column_Number {

	  	/*A -> 1
	    B -> 2
	    C -> 3
	    ...
	    Z -> 26
	    AA -> 27
	    AB -> 28 */
	
	public class Solution {
	    public int titleToNumber(String s) {
	        char[] title = s.toCharArray();
	        int number = 0;
	        for(char c: title) {
	            number = number * 26 + (c - 'A' + 1);
	        }
	        return number;
	    }
	}
	
	
}
