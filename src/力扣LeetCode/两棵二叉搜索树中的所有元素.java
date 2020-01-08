package 力扣LeetCode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
给你 root1 和 root2 这两棵二叉搜索树。
请你返回一个列表，其中包含 两棵树 中的所有整数并按 升序 排序。.

示例 1：
root1 : head:2,left:1,right:4
root2 : head:1,left:0,right:3
输入：root1 = [2,1,4], root2 = [1,0,3]
输出：[0,1,1,2,3,4]

示例 2：
输入：root1 = [0,-10,10], root2 = [5,1,7,0,2]
输出：[-10,0,0,1,2,5,7,10]

示例 3：
输入：root1 = [], root2 = [5,1,7,0,2]
输出：[0,1,2,5,7]

示例 4：
输入：root1 = [0,-10,10], root2 = []
输出：[-10,0,10]

示例 5：
root1 : head:1,right=8
root2 : head:8,left=1
输入：root1 = [1,null,8], root2 = [8,1]
输出：[1,1,8,8]
 */
public class 两棵二叉搜索树中的所有元素 {
	
	public static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(0);
		root1.left = new TreeNode(-10);
		root1.right = new TreeNode(10);
		TreeNode root2 = new TreeNode(5);
		root2.left = new TreeNode(1);
		root2.right = new TreeNode(7);
		root2.left.left = new TreeNode(0);
		root2.left.right = new TreeNode(2);
		List<Integer> list = getAllElements(root1, root2);
		System.out.println(list);
	}
	
    public static List<Integer> getAllElements(TreeNode root1, TreeNode root2) {
    	getElements(root1);
    	getElements(root2);
    	Collections.sort(list);
		return list;
    }
    
    public static void getElements(TreeNode root){
    	if(root != null){
    		list.add(root.val);
    		getElements(root.left);
    		getElements(root.right);
    	}
    }

}
