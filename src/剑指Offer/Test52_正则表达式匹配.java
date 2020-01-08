package 剑指Offer;

/*
 *	请实现一个函数用来匹配包括'.'和'*'的正则表达式。模式中的字符'.'表示任意一个字符，而'*'表示它前面的字符可以出现任意次（包含0次）。 
 *	在本题中，匹配是指字符串的所有字符匹配整个模式。例如，字符串"aaa"与模式"a.a"和"ab*ac*a"匹配，但是与"aa.a"和"ab*a"均不匹配。不能使用除法。
 */

public class Test52_正则表达式匹配 {
	
	public static void main(String[] args) {
		String str1 = "aaa";
		String str2 = "ab*a*c*a";
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		boolean m = match(ch1, ch2);
		System.out.println(m);
	}
	
	/*
	 * aaa
	 * ab*ac*a
	 */
    public static boolean match(char[] str, char[] pattern) {
    	if(pattern.length == 2){
    		if(pattern[0] == '.' && pattern[1] == '*'){
    			return true;
    		}
    		if(str.length == 0 && pattern[1] =='*'){
    			return true;
    		}
    		if(str.length == 1 && pattern[0] == str[0] && pattern[1] == '.'){
    			return false;
    		}
    	}
    	if(pattern.length == 1 && pattern[0] == '.'){
    		if(str.length == 1){
    			return true;
    		}
    		if(str.length > 1){
    			return false;
    		}
    	}
    	int len1 = str.length-1;
    	int len2 = pattern.length-1;
		while(len1 >= 0 && len2 >= 0){
			if(pattern[len2] == '*'){  //aaa   ab*a*c*a
				len2--;
				if(str[len1] != pattern[len2]){
					len2--;
					continue;
				}
				int flag = len2;
				while(str[len1] == pattern[len2]){
					if(len2 > 0 && pattern[len2] == pattern[flag]){
						len2--;
					}
					if(len1 == 0){
						break;
					}
					len1--;
				}
			}
			if(pattern[len2] == '.'){
				len1--;
				len2--;
				if(len1 < 0 || len2 < 0){
					break;
				}
			}
    		if(pattern[len2] != str[len1]){
    			return false;
    		}
			len1--;
			len2--;
		}
		if(len1 >= 0 || len2 >= 0){
			return false;
		}
		return true;
    }
    
}