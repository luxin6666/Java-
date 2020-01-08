package 剑指Offer;

/*
 *	给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */

public class Test55_链表中环的入口结点 {
	
	public static void main(String[] args) {
		ListNode node1 = new ListNode(2);
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(6);
		ListNode node4 = new ListNode(8);
		ListNode node5 = new ListNode(10);
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node1;
		node4.next = node5;
		EntryNodeOfLoop(node1);
	}
	
    public static ListNode EntryNodeOfLoop(ListNode pHead){
		return pHead;
    }
    
}
