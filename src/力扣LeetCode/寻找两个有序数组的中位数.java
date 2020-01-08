package 力扣LeetCode;

import java.util.Arrays;

/*
	 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。
	请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。
	你可以假设 nums1 和 nums2 不会同时为空。
	
	示例 1:
	nums1 = [1, 3]
	nums2 = [2]
	则中位数是 2.0
	
	示例 2:
	nums1 = [1, 2]
	nums2 = [3, 4]
	则中位数是 (2 + 3)/2 = 2.5
 */
public class 寻找两个有序数组的中位数 {

	public static void main(String[] args) {
		int[] num1 = {};
		int[] num2 = {2,3};
		double middleNum = findMedianSortedArrays(num1, num2);
		System.out.println("中位数为："+middleNum);
	}
	
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int len1 = nums1.length; 
		int len2 = nums2.length;
		int len3 = len1 + len2;
		double d = 0;
		int[] num3 = new int[len3];
		int k = 0;
		for(int i=0; i<len1; i++){
			num3[k] = nums1[i];
			k++;
		}
		for(int i=0; i<len2; i++){
			num3[k] = nums2[i];
			k++;
		}
		Arrays.sort(num3);
		if(len3%2 == 0){
			d = (num3[len3/2-1]+num3[len3/2])/2.0;
		}else{
			d = num3[len3/2];
		}
    	return d;
    }

}
