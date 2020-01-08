package PAT_15;

import java.util.Scanner;

/*
 * 约分最简分式 （15 分）
分数可以表示为分子/分母的形式。编写一个程序，要求用户输入一个分数，然后将其约分为最简分式。
最简分式是指分子和分母不具有可以约分的成分了。如6/12可以被约分为1/2。
当分子大于分母时，不需要表达为整数又分数的形式，即11/8还是11/8；
而当分子分母相等时，仍然表达为1/1的分数形式。

输入格式：
输入在一行中给出一个分数，分子和分母中间以斜杠/分隔，如：12/34表示34分之12。分子和分母都是正整数（不包含0，如果不清楚正整数的定义的话）。

提示：在scanf的格式字符串中加入/，让scanf来处理这个斜杠。

输出格式：
在一行中输出这个分数对应的最简分式，格式与输入的相同，即采用分子/分母的形式表示分数。如 5/6表示6分之5。

输入样例：
66/120
输出样例：
11/20
 */
public class test13 {
	
	public static int gcd(int x, int y){ // 这个是运用辗转相除法求 两个数的 最大公约数
		if(y == 0)
		    return x;
		else
		    return gcd(y,x%y);
	}

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] a = line.split("/");
		int m = Integer.parseInt(a[0]); //分子
		int n = Integer.parseInt(a[1]); //分母
		if(m>n){
			System.out.println(m/gcd(m,n)+"/"+n/gcd(m,n));
		}else{
			System.out.println(m/gcd(n,m)+"/"+n/gcd(n,m));
		}
	}

}
