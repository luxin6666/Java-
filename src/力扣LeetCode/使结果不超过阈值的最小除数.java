package 力扣LeetCode;

/*
给你一个整数数组 nums 和一个正整数 threshold  ，你需要选择一个正整数作为除数，然后将数组里每个数都除以它，并对除法结果求和。
请你找出能够使上述结果小于等于阈值 threshold 的除数中 最小 的那个。
每个数除以除数后都向上取整，比方说 7/3 = 3 ， 10/2 = 5 。
题目保证一定有解。

示例 1：
输入：nums = [1,2,5,9], threshold = 6
输出：5
解释：如果除数为 1 ，我们可以得到和为 17 （1+2+5+9）。
	如果除数为 4 ，我们可以得到和为 7 (1+1+2+3) 。
	如果除数为 5 ，和为 5 (1+1+1+2)。
	如果除数为 6 ，和为 5 (1+1+1+2)。

示例 2：
输入：nums = [2,3,5,7,11], threshold = 11
输出：3
解释：如果除数为 2 ，我们可以得到和为 16 （1+2+3+4+6）。
	如果除数为 3 ，我们可以得到和为 11 (1+1+2+3+4) 。
	如果除数为 4 ，和为 9 (1+1+2+2+3)。

示例 3：
输入：nums = [19], threshold = 5
输出：4
解释：如果除数为 3 ，我们可以得到和为 7 （7）。
	如果除数为 4 ，和为 5 (5)。
	如果除数为 5 ，和为 4 (4)。

提示：
1 <= nums.length <= 5 * 10^4
1 <= nums[i] <= 10^6
nums.length <= threshold <= 10^6
 */
public class 使结果不超过阈值的最小除数 {

	public static void main(String[] args) {
		int[] nums = {1,2,5,9};
		int threshold = 6;
		System.out.println(smallestDivisor(nums,threshold));
	}

    public static int smallestDivisor(int[] nums, int threshold) {
    	long arraySum = 0;
    	//最小为1，则和会是最大。（除数越大，和越小）
    	for (int num : nums) {
			arraySum += num;
		}
    	long low = 1, high = arraySum;
    	//二分查找
    	while(low < high){
    		long mid = (high-low)/2 + low;
    		int sum = 0;
    		//求和
    		for (int num : nums) {
				int quotient = (int)Math.ceil(num*1.0/mid);
				sum += quotient;
			}
    		//和大于阈值(要使和变小，除数就要变大)
    		if(sum > threshold){
    			low = mid + 1;
    		}else{
    			//和小于阈值(要使和变大，除数就要变小)
    			high = mid;
    		}
    	}
    	return (int)low;
    }
	
}
