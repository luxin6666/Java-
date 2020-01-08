package 剑指Offer;

/*
 *	输入一个链表，输出该链表中倒数第k个结点
 */

public class Test14_链表中倒数第k个节点 {
	
	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(10);
		ListNode listNode2 = new ListNode(12);
		ListNode listNode3 = new ListNode(18);
		ListNode listNode4 = new ListNode(16);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		ListNode node = FindKthToTail(listNode1,3);
		System.out.println(node.val);
	}
	
	public static ListNode FindKthToTail(ListNode head,int k) {
		if(head == null || k <= 0){
			return null;
		}
		ListNode h1 = head;
		ListNode h2 = head;
		for(int i=1; i<k; i++){
			if(h1.next != null){
				h1 = h1.next;
			}else{
				return null;
			}
		}
		while(h1.next != null){
			h1 = h1.next;
			h2 = h2.next;
		}
		return h2;
		/*ListNode node = head;
		int count = 0;
		int num = 1;
		while(head != null){
			head = head.next;
			count++;
		}
		while(num < count-k+1){
			node = node.next;
			num++;
		}
		return node;*/
    }
	
}
