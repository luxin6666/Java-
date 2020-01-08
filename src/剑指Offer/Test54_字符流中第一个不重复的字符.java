package 剑指Offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 *	请实现一个函数用来找出字符流中第一个只出现一次的字符。
 *  例如，当从字符流中只读出前两个字符"go"时，第一个只出现一次的字符是"g"。
 *  当从该字符流中读出前六个字符“google"时，第一个只出现一次的字符是"l"。
 *  
 *  输出描述:
 *  如果当前字符流没有存在出现一次的字符，返回#字符。
 */

public class Test54_字符流中第一个不重复的字符 {
	
	private static Map<Character, Integer> map = new HashMap<Character, Integer>();
	private static List<Character> list = new ArrayList<Character>();
	
	public static void main(String[] args) {
		Insert('h');
		Insert('e');
		Insert('l');
		Insert('l');
		Insert('o');
		Insert('w');
		Insert('o');
		Insert('r');
		Insert('l');
		Insert('d');
		System.out.println(FirstAppearingOnce());
	}
	
    public static void Insert(char ch){
        if(map.containsKey(ch)){
        	map.put(ch, map.get(ch)+1);
        }else{
        	map.put(ch, 1);
        }
        list.add(ch);
    }
    public static char FirstAppearingOnce(){
    	for (Character c : list) {
			if(map.get(c) == 1){
				return c;
			}
		}
		return '#';
    }
    
}
