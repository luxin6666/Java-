package 力扣LeetCode;

import java.util.Scanner;

/*
给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。

示例 1:
输入: 123
输出: 321

示例 2:
输入: -123
输出: -321

示例 3:
输入: 120
输出: 21
 */
public class 整数反转 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		System.out.println(reverse(n));
	}
	
    public static int reverse(int x) {
    	if(x == 0){
    		return 0;
    	}
    	String str = String.valueOf(x);
    	StringBuffer sb = new StringBuffer();
    	int len = str.length();
    	int index = 0;
    	boolean flag = true;
    	if(str.charAt(0) == '-'){
    		index = 1;
    		flag = false;
    	}
    	for(int i=len-1; i>=index; i--){
    		sb.append(str.charAt(i));
    	}
    	String s = sb.toString();
    	int m = 0;
		try {
			m = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
    	if(flag){
    		return m;
    	}else{
    		return (0-m);
    	}
    }

}
