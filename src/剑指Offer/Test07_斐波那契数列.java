package 剑指Offer;

/*
 *	大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。n<=39
 *	0,1,1,2,3,5,8,13...
 */

public class Test07_斐波那契数列 {
	
	public static void main(String[] args) {
		int n = Fibonacci(0);
		System.out.println(n);
	}

	public static int Fibonacci(int n) {

		 if (n <= 1)
             return n;
         int res = 0;
         int n1 = 0;
         int n2 = 1;
         for (int i=2; i<=n; i++){
             res = (n1 + n2);
             n1 = n2;
             n2 = res;           
         }
        return res;
		
    }
	
}
