package 剑指Offer;

import java.util.ArrayList;

/*
 *	输入一个递增排序的数组和一个数字S，在数组中查找两个数，使得他们的和正好是S，如果有多对数字的和等于S，输出两个数的乘积最小的。
 *
 *	输出描述:
 *	对应每个测试案例，输出两个数，小的先输出。
 */


public class Test42_和为S的两个数字 {
	
	//虽然有一个乘积最小的限制，但是题目要求是排过序的，还是递增排序，所以头尾相加是最快的方法，第一组遇到的和sum相等的值就一定是乘积最小的（和相同，差越大，乘积就越小）
	public static void main(String[] args) {
		int[] arr = {1,3,5,7,9};
		int sum = 8;
		ArrayList<Integer> list = FindNumbersWithSum(arr, sum);
		System.out.println(list);
	}
	
    public static ArrayList<Integer> FindNumbersWithSum(int [] array,int sum) {
    	ArrayList<Integer> list = new ArrayList<>();
    	if(array.length<2 || array == null){
    		return list;
    	}
    	int len = array.length;
    	int start = 0;
    	int end = array.length-1;
    	while(start < end){
    		if(array[start] + array[end] == sum){
    			list.add(array[start]);
    			list.add(array[end]);
    			return list;
    		}
    		if(array[start] + array[end] > sum){
    			end--;
    		}
    		if(array[start] + array[end] < sum){
    			start++;
    		}
    	}
		return list;
    }
    
}
