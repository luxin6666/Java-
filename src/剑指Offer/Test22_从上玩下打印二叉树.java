package 剑指Offer;

import java.util.ArrayList;

/*
 *	从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */

public class Test22_从上玩下打印二叉树 {
	
	public static void main(String[] args) {
		TreeNode tree = new TreeNode(1);
		tree.left = new TreeNode(2);
		tree.right = new TreeNode(3);
		tree.left.left = new TreeNode(4);
		tree.left.right = new TreeNode(5);
		tree.right.left = new TreeNode(6);
		tree.right.right = new TreeNode(7);
		ArrayList<Integer> list = PrintFromTopToBottom(tree);
		System.out.println(list.toString());
	}

	//使用两个队列一个存放节点，一个存放值。先将根节点加入到队列中，然后遍历队列中的元素，遍历过程中，访问该元素的左右节点，再将左右子节点加入到队列中来
	public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
		//创建一个列表用来存储值
		ArrayList<Integer> intList = new ArrayList<Integer>();
		//创建一个列表用来存储节点 
		ArrayList<TreeNode> treeList = new ArrayList<>();
		//没有节点 
		if(root == null){
			return intList;
		}
		//先存入根节点
		treeList.add(root);
		//循环遍历列表，一开始列表中只有根节点，因此size==1   
		for(int i=0; i<treeList.size(); i++){
			TreeNode node = treeList.get(i);
			//如果左子节点不为空，则将左子节点加入到列表中，这时列表的size加1  
			if(node.left != null){
				treeList.add(node.left);
			}
			//如果右子节点不为空，则将右子节点加入到列表中，这时列表的size加1
			if(node.right != null){
				treeList.add(node.right);
			}
			intList.add(node.val);
			//因为执行上面操作后会增加列表的size，因此可以继续循环下一个节点，直到循环完所有节点
		}
		return intList;
    }
	
}
