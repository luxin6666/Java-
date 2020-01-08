package 力扣LeetCode;

import java.util.PriorityQueue;

/*
给你一个整数数组 nums 和一个正整数 k，请你判断是否可以把这个数组划分成一些由 k 个连续数字组成的集合。
如果可以，请返回 True；否则，返回 False。

示例 1：
输入：nums = [1,2,3,3,4,4,5,6], k = 4
输出：true
解释：数组可以分成 [1,2,3,4] 和 [3,4,5,6]。

示例 2：
输入：nums = [3,2,1,2,3,4,3,4,5,9,10,11], k = 3
输出：true
解释：数组可以分成 [1,2,3] , [2,3,4] , [3,4,5] 和 [9,10,11]。

示例 3：
输入：nums = [3,3,2,2,1,1], k = 3
输出：true

示例 4：
输入：nums = [1,2,3,4], k = 3
输出：false
解释：数组不能分成几个大小为 3 的子数组。
 */
public class 划分数组为连续数字的集合 {

	public static void main(String[] args) {
		int[] nums = { 3, 2, 1, 2, 3, 4, 3, 4, 5, 9, 10, 11 };
		int k = 3;
		System.out.println(isPossibleDivide(nums, k));
	}

	public static boolean isPossibleDivide(int[] nums, int k) {
        int len = nums.length;
        if (len % k != 0) {
            return false;
        }
    	/*
		           优先队列PriorityQueue是Queue接口的实现，可以对其中元素进行排序，
			可以放基本数据类型的包装类（如：Integer，Long等）或自定义的类
			对于基本数据类型的包装器类，优先队列中元素默认排列顺序是升序排列
		*/
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(len);
        for (int num : nums) {
            minHeap.offer(num);
        }
        while (!minHeap.isEmpty()) {
            Integer top = minHeap.poll();
            for (int i = 1; i < k; i++) {
                // 从 1 开始，正好需要移除 k - 1 个元素
                // i 正好就是相对于 top 的偏移
                // 注意：这个 remove 操作会线性去扫 top + i 的索引，时间复杂度是 O(N)
                if (!minHeap.remove(top + i)) {
                    // 如果移除失败，说明划分不存在，直接返回 false 即可
                    return false;
                }
            }
        }
        return true;
	}

}
