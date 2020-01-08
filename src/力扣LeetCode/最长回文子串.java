package 力扣LeetCode;
/*
给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为 1000。

示例 1：
输入: "babad"
输出: "bab"
注意: "aba" 也是一个有效答案。

示例 2：
输入: "cbbd"
输出: "bb"
 */

public class 最长回文子串 {
	public static void main(String[] args) {
		String s = "babad";
		String str = longestPalindrome(s);
		System.out.println(str);
	}
    public static String longestPalindrome(String s) {
    	int len = s.length();
    	if(len < 2){
    		return s;
    	}
    	int maxLen = 1;
    	String res = s.substring(0, 1);
    	//找出所有长度大于等于2的子串
    	for(int i=0; i<len; i++){
    		for(int j=i+1; j<len; j++){
    			if(j-i+1 > maxLen && valid(s, i, j)){
    				maxLen = j-i+1;
    				res = s.substring(i, j+1);
    			}
    		}
    	}
		return res;
    }
    //验证是否为回文子串
    public static boolean valid(String str, int left, int right){
    	while(left < right){
	    	if(str.charAt(left) != str.charAt(right)){
	    		return false;
	    	}
	    	left ++;
	    	right --;
    	}
    	return true;
    }
}
