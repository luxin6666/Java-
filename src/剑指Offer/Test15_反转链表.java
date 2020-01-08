package 剑指Offer;

/*
 *	输入一个链表，反转链表后，输出新链表的表头。
 */

public class Test15_反转链表 {
	
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(2);
		ListNode listNode2 = new ListNode(4);
		ListNode listNode3 = new ListNode(6);
		ListNode listNode4 = new ListNode(8);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		ListNode node = ReverseList(listNode1);
		System.out.println(node.val);
	}
	
	public static ListNode ReverseList(ListNode head) {
		if(head==null) {
			return null;
		}
		ListNode preNode = null;
		ListNode nextNode = null;
		while(head != null){
			nextNode = head.next; //让nextNode引用指向head下一个节点
			head.next = preNode; //preNode始终指向当前head的前一个节点
			preNode = head;
			head = nextNode;
		}
		return preNode;
    }
	
}
