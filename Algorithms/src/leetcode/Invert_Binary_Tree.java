package leetcode;

public class Invert_Binary_Tree {
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public class Solution {
	    public TreeNode invertTree(TreeNode root) {
	        if(root == null){
	                return null;
	            }

	            TreeNode left = root.left;
	            TreeNode right = root.right;

	            root.right = left;
	            root.left = right;

	            invertTree(left);
	            invertTree(right);

	            return root;
	    }
	}
}
