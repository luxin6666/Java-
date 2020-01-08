package 剑指Offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 *	输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 *	例如输入数组{3，32，321}，则打印出这三个数字能排成的最小数字为321323。
 */

public class Test32_把数组排成最小的数 {
	
	public static void main(String[] args) {
		//int[] a = {3,32,321}; // 321323
		int[] a = {3,5,1,4,2}; // 12345
		//System.out.println(PrintMinNumber(a));
		System.out.println(PrintMinNumber2(a));
	}

    public static String PrintMinNumber(int [] numbers) {
    	String s = "";
    	ArrayList<Integer> list = new ArrayList<>();
    	for (int i = 0; i < numbers.length; i++) {
			list.add(numbers[i]);
		}
    	Collections.sort(list, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				String str1 = o1 + "" + o2; 
				String str2 = o2 + "" + o1;
				return str1.compareTo(str2);
			}
		});
    	for (Integer n : list) {
			s += n;
		}
		return new String(s);
    }
    
    public static String PrintMinNumber2(int [] numbers) {
        if(numbers == null){
            return null;
        }
        StringBuffer sb = new StringBuffer();
        String pre,last;
        int temp;
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                pre = numbers[i] + "" +  numbers[j];    //转换成字符串的形式
                last = numbers[j] + "" +  numbers[i];
                if(pre.compareTo(last) > 0){    //比较组合之后的ab和ba
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
            sb.append(numbers[i]);
        }
        return sb.toString();
    }
	
}
