package 剑指Offer;

/*
 *	我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *	1 -> 1
 *	2 -> 2
 *	3 -> 3
 *	4 -> 5
 *  5 -> 8
 *  ...f(n)=f(n-1)+f(n-2)
 */

public class Test10_矩形覆盖 {
	
	public static void main(String[] args) {
		int n = RectCover(5);
		System.out.println(n);
	}

	public static int RectCover(int target) {
		int res = 0;
		if(target == 1){
			return 1;
		}
		if(target == 2){
			return 2;
		}
		int n1 = 1;
		int n2 = 2;
		for(int i=2; i<target; i++){
			res = n1 + n2;
			n1 = n2;
			n2 = res;
		}
		return res;
    }
	
}
