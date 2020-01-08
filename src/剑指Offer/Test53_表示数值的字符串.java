package 剑指Offer;

/*
 *	请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 *  例如，字符串"+100","5e2","-123","3.1416"和"-1E-16"都表示数值。 
 *  但是"12e","1a3.14","1.2.3","+-5"和"12e+4.3"都不是。
 */

public class Test53_表示数值的字符串 {
	
	public static void main(String[] args) {
		String str = "12e+4.3";
		char[] ch = str.toCharArray();
		System.out.println(isNumeric(ch));
	}
	
    public static boolean isNumeric(char[] ch) {
    	String str = String.valueOf(ch);
    	String pattern = "[+,-]?[0-9]*(\\.[0-9]*)?([eE][+,-]?[0-9]+)?";
    	if(str.matches(pattern)){
    		return true;
    	}else{
    		return false;
    	}
    }
    
}
