package 剑指Offer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 *	输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 *	输入描述:
 *	输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 */

public class Test27_字符串的排序 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		//System.out.println(Permutation(line).toString());
		System.out.println(Permutation2(line).toString());
	}

	/*
	 * 全排列    
	 */
	private static StringBuffer sb = new StringBuffer();
	private static ArrayList<String> list = new ArrayList<>();
	public static ArrayList<String> Permutation(String str) {
		int start = 0;
		char[] c = str.toCharArray();
		Permutation(c, start , c.length-1);
		return list;
    }

	public static void Permutation(char[] c, int start, int length) {
		if(start == length){
			for(int i=0; i<=length; i++){
				sb.append(c[i]);
			}
			if(list.contains(new String(sb))){
				
			}else{
				list.add(new String(sb));
			}
			sb = new StringBuffer();
		}
		for(int i=start; i<=length; i++){
			swap(c, start, i);
			Permutation(c, start+1, length);
			swap(c, start, i);
		}
		
	}

	public static void swap(char[] c, int start, int i) {
		char temp;
		temp = c[i];
		c[i] = c[start];
		c[start] = temp;
	}

	/*
	 * 字典序排列
	 */
	public static ArrayList<String> Permutation2(String str){
        ArrayList<String> list2 = new ArrayList<String>();
        if(str==null || str.length()==0){
            return list2;
        }
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        list2.add(String.valueOf(chars));
        int len = chars.length;
        while(true){
            int lIndex = len-1;
            int rIndex;
            while(lIndex>=1 && chars[lIndex-1]>=chars[lIndex]){
                lIndex--;
            }
            if(lIndex == 0)
                break;
            rIndex = lIndex;
            while(rIndex<len && chars[rIndex]>chars[lIndex-1]){
                rIndex++;
            }
            swap(chars,lIndex-1,rIndex-1);
            reverse(chars,lIndex);
            list2.add(String.valueOf(chars));
        }
 
        return list2;
    }
 
	public static void reverse(char[] chars,int k){
        if(chars==null || chars.length<=k)
            return;
        int len = chars.length;
        for(int i=0;i<(len-k)/2;i++){
            int m = k+i;
            int n = len-1-i;
            if(m<=n){
                swap(chars,m,n);
            }
        }
    }
	
}
