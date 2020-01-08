package 剑指Offer;

import java.util.HashMap;
import java.util.Map;

/*
 *	在一个长度为n的数组里的所有数字都在0到n-1的范围内。 数组中某些数字是重复的，但不知道有几个数字是重复的。也不知道每个数字重复几次。
 *	请找出数组中任意一个重复的数字。 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */

public class Test50_数组中重复的数字 {
	
	public static void main(String[] args) {
		int[] numbers = {2,3,1,0,2,5,3};
		int length = 7;
		int[] duplication = {2};
		boolean b = duplicate(numbers, length, duplication);
		System.out.println(b);
	}
	
    public static boolean duplicate(int numbers[],int length,int [] duplication) {
    	if(numbers.length < 1 || numbers == null || numbers.equals("") || length < 1 || numbers.length != length){
    		return false;
    	}
    	Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    	for(int i=0; i<length; i++){
    		if(map.containsKey(numbers[i])){
    			duplication[0] = numbers[i];
    			return true;
    		}else{
    			map.put(numbers[i], 1);
    		}
    	}
		return false;
    }
    
}
