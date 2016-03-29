package leetcode;

public class Maximum_Depth_Binary_Tree {

	public static void main(String[] args) {

		
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	 
	public class Solution {
	    public int maxDepth(TreeNode root) {
	        if(root==null)return 0;
	        else{
	            int l=maxDepth(root.left);
	            int r=maxDepth(root.right);
	            return l > r ? l+1 : r+1;
	        }
	    }
	}
	
}
