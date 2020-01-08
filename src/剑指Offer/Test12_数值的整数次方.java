package 剑指Offer;

/*
 *	给定一个double类型的浮点数base和int类型的整数exponent。求base的exponent次方。
 *  保证base和exponent不同时为0
 */

public class Test12_数值的整数次方 {
	
	public static void main(String[] args) {
		Double d = Power(0,2);//0.12500
		System.out.println(d);
	}

	public static double Power(double base, int exponent) {
		return Math.pow(base, exponent);
	}
	
}
