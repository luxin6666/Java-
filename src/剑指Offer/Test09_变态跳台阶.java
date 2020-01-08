package 剑指Offer;

/*
 *	一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *	1 -> 1
 *	2 -> 2
 *	3 -> 4
 *	4 -> 8
 *	5 -> 16
 *	...f(n)=2*f(n-1)
 */

public class Test09_变态跳台阶 {
	
	public static void main(String[] args) {
		int n = JumpFloorII(5);
		System.out.println(n);
	}

	public static int JumpFloorII(int target) {
		if(target == 1){
			return 1;
		}
		if(target == 2){
			return 2;
		}
		return 2*JumpFloorII(target-1);
    }
	
}
