package 剑指Offer;

/*
 *	在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置, 如果没有则返回 -1（需要区分大小写）.
 */

public class Test34_第一个只出现一次的字符位置 {
	
	public static void main(String[] args) {
		System.out.println(FirstNotRepeatingChar("google"));
	}

    public static int FirstNotRepeatingChar(String str) {
    	boolean flag = true;
    	for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if(i == j){
					continue;
				}
				if(i == str.length()-1){
					return str.length()-1;
				}
				if(str.charAt(i) == str.charAt(j)){
					flag = false;
					break;
				}else{
					flag = true;
				}
			}
			if(flag == true){
				return i;
			}
		}
        return -1;
    }

}
