package 剑指Offer;

/*
 *	写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
 */

public class Test48_不用加减乘除做加法 {
	
	public static void main(String[] args) {
		System.out.println(Add(3,5));
	}
	
    public static int Add(int num1,int num2) {
    	if(num1 > 0){
    		while(num1-- != 0){
    			num2++;
    		}
    	}
    	else if(num1 < 0){
    		while(num1++ != 0){
    			num2--;
    		}
    	}
		return num2;
    }
    
}
