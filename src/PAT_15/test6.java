package PAT_15;

import java.util.Scanner;

/*
 * 求整数段和 （15 分）
给定两个整数A和B，输出从A到B的所有整数以及这些数的和。

输入格式：
输入在一行中给出2个整数A和B，其中−100≤A≤B≤100，其间以空格分隔。

输出格式：
首先顺序输出从A到B的所有整数，每5个数字占一行，每个数字占5个字符宽度，向右对齐。最后在一行中按Sum = X的格式输出全部数字的和X。

输入样例：
-3 8
输出样例：
   -3   -2   -1    0    1
    2    3    4    5    6
    7    8
Sum = 30
 */
public class test6 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		/*String line = input.nextLine();
		String[] a = line.split(" ");
		int A = Integer.parseInt(a[0]);
		int B = Integer.parseInt(a[1]);*/
		int n = 0;
		int sum = 0;
		for(int i=A; i<=B; i++){
			n++;
			//System.out.print("\t");
			if(n%5==0){
				System.out.printf("%5d",i);
				System.out.println();
				sum = sum+i;
				if(i == B){
					System.out.println("Sum = "+sum);
					break;
				}
				continue;
			}
			//System.out.print(i);
			System.out.printf("%5d",i);
			sum = sum+i;
			if(i == B){
				System.out.println();
				System.out.println("Sum = "+sum);
			}
		}
		
	}

}
