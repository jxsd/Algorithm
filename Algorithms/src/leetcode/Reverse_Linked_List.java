package leetcode;

import leetcode.Delete_Node_in_a_Linked_List.ListNode;

public class Reverse_Linked_List {

	
	
	
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	public ListNode reverseList(ListNode head) {
        //ͷ�巨�������еĽڵ����β���ͷ�ڵ��ǰ��
        ListNode curr = null;
        ListNode temp = head;
        ListNode pre = null;
        while(temp!=null){
            pre=curr;
            curr=temp;
            temp=curr.next;
            curr.next=pre;
        }
        return curr;
    }
	
}
