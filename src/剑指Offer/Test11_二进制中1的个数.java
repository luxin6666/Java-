package 剑指Offer;

/*
 *	输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *	7=111
 *	8=1000
 */

public class Test11_二进制中1的个数 {
	
	public static void main(String[] args) {
		int n = NumberOf1(-7);
		System.out.println(n);
	}

	public static int NumberOf1(int n) {
		int count = 0;
		String str = Integer.toBinaryString(n);
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == '1'){
				count++;
			}
		}
		return count;
    }
	
}
