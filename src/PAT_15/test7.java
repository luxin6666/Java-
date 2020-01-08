package PAT_15;

import java.util.Scanner;

/*
 *  计算圆周率 （15 分）
根据下面关系式，求圆周率的值，直到最后一项的值小于给定阈值。
​π/2=1+1/3+2!/(3*5)+3!/(3*5*7)+...+n!/(3*5*7*...*(2n+1))+...

输入格式：
输入在一行中给出小于1的阈值。

输出格式：
在一行中输出满足阈值条件的近似圆周率，输出到小数点后6位。

输入样例：
0.01
输出样例：
3.132157
 */
public class test7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		float n = input.nextFloat();
		int i = 1;
		float molecular = 1; //分子
		float denominator = 1; // 分母
		float sum = 1;
		while(molecular/denominator >= n){
			molecular = molecular * i;
			denominator = denominator*(2*i+1);
			i++;
			sum = sum + (molecular/denominator);
		}
		sum = sum*2;
		System.out.printf("%.6f",sum);

	}

}
