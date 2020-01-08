package 剑指Offer;

/*
 *	输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */

public class Test16_合并两个排序的链表 {
	
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(2);
		ListNode listNode2 = new ListNode(4);
		ListNode listNode3 = new ListNode(6);
		ListNode listNode4 = new ListNode(8);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		ListNode node1 = new ListNode(1);
		ListNode node2 = new ListNode(3);
		ListNode node3 = new ListNode(5);
		ListNode node4 = new ListNode(7);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		ListNode listNode = Merge(listNode1, node1);
		System.out.println(listNode.next.next.val);
	}
	
	public static ListNode Merge(ListNode list1,ListNode list2) {
		ListNode list3 = new ListNode(0);
		ListNode list = list3;
		while(list1 != null && list2 != null){
			if(list1.val < list2.val){
				list3.next = list1;
				list3 = list1;
				list1 = list1.next;
			}else{
				list3.next = list2;
				list3 = list2;
				list2 = list2.next;
			}
		}
		if(list1 != null){
			list3.next = list1;
		}
		if(list2 != null){
			list3.next = list2;
		}
		return list.next;
    }
	
}
