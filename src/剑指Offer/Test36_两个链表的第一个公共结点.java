package 剑指Offer;

import java.util.HashMap;
import java.util.Map;

/*
 *	输入两个链表，找出它们的第一个公共结点。
 */

public class Test36_两个链表的第一个公共结点 {
	
	public static void main(String[] args) {
		/*ListNode listNode1 = new ListNode(2);
		ListNode listNode2 = new ListNode(4);
		ListNode listNode3 = new ListNode(6);
		ListNode listNode4 = new ListNode(8);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(7);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		ListNode node = FindFirstCommonNode(listNode1, node1);
		System.out.println(node.val);*/
	}
	
    public static ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
    	if (pHead1 == null || pHead2 == null) {
    		return null;
    	}
    	Map<ListNode, String> map = new HashMap<ListNode, String>();
		while(pHead1 != null){
			map.put(pHead1, null);
			pHead1 = pHead1.next;
		}
		while(pHead2 != null){
			if(map.containsKey(pHead2)){
				return pHead2;
			}
			pHead2 = pHead2.next;
		}
        return null;
    }
  
}
