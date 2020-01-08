package 剑指Offer;

import java.util.ArrayList;

/*
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
   public class ListNode {
    	int val;
    	ListNode next = null;
    	ListNode(int val) {
        	this.val = val;
    	}
	}
 */

public class Test03_从尾到头打印链表 {

	public static void main(String[] args) {
		ListNode listNode1 = new ListNode(10);
		ListNode listNode2 = new ListNode(12);
		ListNode listNode3 = new ListNode(18);
		ListNode listNode4 = new ListNode(16);
		listNode1.next = listNode2;
		listNode2.next = listNode3;
		listNode3.next = listNode4;
		ArrayList<Integer> list = printListFromTailToHead(listNode1);
		for (Integer integer : list) {
			System.out.print(integer+",");
		}
	}
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> arr = new ArrayList<>();
		ArrayList<Integer> arr2 = new ArrayList<>();
		while(listNode != null){
			arr.add(listNode.val);
			listNode = listNode.next;
		}
		for(int i=arr.size()-1; i>=0; i--){
			arr2.add(arr.get(i));
		}
		return arr2;
    }
	
}
	
