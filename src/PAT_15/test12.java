package PAT_15;

import java.util.Scanner;

/*
 * 求特殊方程的正整数解 （15 分）
本题要求对任意给定的正整数N，求方程 X^2+Y^2=N 的全部正整数解。

输入格式：
输入在一行中给出正整数N（≤10000）。

输出格式：
输出方程  X^2+Y^2=N 的全部正整数解，其中X≤Y。每组解占1行，两数字间以1空格分隔，按X的递增顺序输出。如果没有解，则输出No Solution。

输入样例1：
884
输出样例1：
10 28
20 22
输入样例2：
11
输出样例2：
No Solution
 */
public class test12 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int N = input.nextInt();
		int i,j;
		int flag = 0;
		for(i=0; i<100; i++){
			for(j=0; j<100; j++){
				if((Math.pow(i, 2)+Math.pow(j, 2))==N && i<=j){
					System.out.println(i+" "+j);
					flag = 1;
					break;
				}
			}
		}
		if(flag == 0){
			System.out.println("No Solution");
		}
		
	}

}
