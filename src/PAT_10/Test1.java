package PAT_10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * 逆序的三位数（10 分）
程序每次读入一个正3位数，然后输出按位逆序的数字。注意：当输入的数字含有结尾的0时，输出不应带有前导的0。比如输入700，输出应该是7。

输入格式：
每个测试是一个3位的正整数。

输出格式：
输出按位逆序的数。

输入样例：
123
输出样例：
321
 */
public class Test1 {

	public static void main(String[] args) {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int n = 0;
		try {
			n = Integer.parseInt(bf.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		long start = System.currentTimeMillis();
		int m;
		while(n!=0){
			m = n%10;
			if(m != 0){
				System.out.print(m);
			}
			n = n/10;
		}
		long end = System.currentTimeMillis();
		System.out.println("耗时："+(end-start));
	}

}
