package PAT_15;

import java.util.Scanner;

/*
 * 厘米换算英尺英寸 （15 分）
如果已知英制长度的英尺foot和英寸inch的值，那么对应的米是(foot+inch/12)×0.3048。现在，如果用户输入的是厘米数，
那么对应英制长度的英尺和英寸是多少呢？别忘了1英尺等于12英寸。

输入格式：
输入在一行中给出1个正整数，单位是厘米。

输出格式：
在一行中输出这个厘米数对应英制长度的英尺和英寸的整数值，中间用空格分开。

输入样例：
170
输出样例：
5 6
 */
public class test1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int foot,inch;
		//System.out.println(n/100.0/0.3048);
		foot = (int) (n/100.0/0.3048);
		inch = (int) ((n/100.0/0.3048-foot)*12);
		System.out.println(foot+" "+inch);
		
	}

}
