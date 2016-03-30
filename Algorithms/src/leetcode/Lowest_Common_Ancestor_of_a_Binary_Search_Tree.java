package leetcode;

public class Lowest_Common_Ancestor_of_a_Binary_Search_Tree {

	//��һ�������������У��������ڵ������Ĺ������Ƚڵ�
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        return (p.val<root.val && q.val<root.val) ? lowestCommonAncestor(root.left,p,q) : (p.val>root.val && q.val>root.val) ? lowestCommonAncestor(root.right,p,q) : root;
        //�����ǵ�һ��
        //�����ǵڶ���
/*		if (p.val > q.val)
			return lowestCommonAncestor(root, q, p);
		if (root.val >= p.val && root.val <= q.val)
			return root;
		return lowestCommonAncestor(root.val > p.val ? root.left : root.right, p, q);
*/
	}
	
}
