package 力扣LeetCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。

示例 1:
输入: "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。

示例 2:
输入: "bbbbb"
输出: 1
解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。

示例 3:
输入: "pwwkew"
输出: 3
解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
 */
public class 无重复字符的最长子串 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		int len = lengthOfLongestSubstring(str);
		System.out.println(len);
	}
	
    public static int lengthOfLongestSubstring(String s) {
		int len = s.length();
		Set<Character> set = null;
		int maxLen = 0;
		int size = 0;
		for(int i=0; i<len; i++){
			size = 0;
			set = new HashSet<>();
			for(int j=i; j<len; j++){
				if(set.contains(s.charAt(j))){
					size = set.size();
					break;
				}else{
					set.add(s.charAt(j));
				}
				
			}
			size = set.size();
			if(maxLen<size){
				maxLen = size;
			}
		}
		return maxLen;
    }

}
