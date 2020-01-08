package 剑指Offer;

/*
 *	求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）。
 */

//	等差数列求和：n*(n+1)/2=(n^2+n)/2
public class Test47_求1到n的和 {
	
	public static void main(String[] args) {
		System.out.println(Sum_Solution(10));
	}
	
    public static int Sum_Solution(int n) {
    	return (int)(Math.pow(n, 2) + n) / 2;
    }
    
}
