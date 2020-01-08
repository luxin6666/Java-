package PAT_15;

import java.util.Scanner;

/*
 * 有理数加法 （15 分）
本题要求编写程序，计算两个有理数的和。

输入格式：
输入在一行中按照a1/b1 a2/b2的格式给出两个分数形式的有理数，其中分子和分母全是整形范围内的正整数。

输出格式：
在一行中按照a/b的格式输出两个有理数的和。注意必须是该有理数的最简分数形式，若分母为1，则只输出分子。

输入样例1：
1/3 1/6
输出样例1：
1/2
输入样例2：
4/3 2/3
输出样例2：
2
 */
public class test16 {

	public static int gcd(int x, int y){ // 这个是运用辗转相除法求 两个数的 最大公约数
		if(y == 0)
		    return x;
		else
		    return gcd(y,x%y);
	}
	
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		String[] a = line.split(" ");
		String[] b = a[0].split("/");
		String[] c = a[1].split("/");
		int a1 = Integer.parseInt(b[0]); //分子
		int b1 = Integer.parseInt(b[1]); //分母
		int a2 = Integer.parseInt(c[0]); //分子
		int b2 = Integer.parseInt(c[1]); //分母
		int molecular,molecular1; //分子
		int denominator,denominator1; // 分母
		//System.out.println(a1+" "+b1+" "+a2+" "+b2);
		a1 = a1 * b2;
		a2 = a2 * b1;
		molecular = a1 + a2;
		denominator = b1 * b2;
		//System.out.println("-------"+molecular+"/"+denominator+"-------");
		if(molecular>denominator){
			molecular1 = molecular/gcd(molecular,denominator);
			denominator1 = denominator/gcd(molecular,denominator);
		}else{
			molecular1 = molecular/gcd(denominator,molecular);
			denominator1 = denominator/gcd(denominator,molecular);
		}
		//System.out.println("-------"+molecular+"/"+denominator+"-------");
		
		if(molecular1%denominator1!=0){
			System.out.println(molecular1+"/"+denominator1);
		}else{
			System.out.println(molecular1/denominator1);
		}
		
	}

}
