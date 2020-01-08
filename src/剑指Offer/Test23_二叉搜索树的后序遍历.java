package 剑指Offer;

import java.util.Arrays;

/*
 *	输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */

public class Test23_二叉搜索树的后序遍历 {
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,5,6,7};
		boolean vs = VerifySquenceOfBST(arr);
		System.out.println(vs);
	}

	public static boolean VerifySquenceOfBST(int [] sequence) {
		if(sequence == null || sequence.length <= 0){
			return false;
		}
		int len = sequence.length;
		int root = sequence[len-1];
		int i = 0;
		for(; i<len-1; i++){
			if(root < sequence[i]){
				break;
			}
		}
		int j = i;
		for(; j<len-1; j++){
			if(sequence[j] < root){
				return false;
			}
		}
		boolean leftFlag = true;
		if(0 < i){
			leftFlag = VerifySquenceOfBST(Arrays.copyOfRange(sequence, 0, i));
		}
		boolean rightFlag = true;
		if(i < len-1){
			rightFlag = VerifySquenceOfBST(Arrays.copyOfRange(sequence, i, len-1));
		}
		return leftFlag && rightFlag;
    }
	
}
