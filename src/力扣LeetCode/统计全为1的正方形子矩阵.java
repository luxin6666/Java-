package 力扣LeetCode;

/*
给你一个 m * n 的矩阵，矩阵中的元素不是 0 就是 1，请你统计并返回其中完全由 1 组成的 正方形 子矩阵的个数。

示例 1：
输入：matrix =
[
  [0,1,1,1],
  [1,1,1,1],
  [0,1,1,1]
]
输出：15
解释： 
边长为 1 的正方形有 10 个。
边长为 2 的正方形有 4 个。
边长为 3 的正方形有 1 个。
正方形的总数 = 10 + 4 + 1 = 15.

示例 2：
输入：matrix = 
[
  [1,0,1],
  [1,1,0],
  [1,1,0]
]
输出：7
解释：
边长为 1 的正方形有 6 个。 
边长为 2 的正方形有 1 个。
正方形的总数 = 6 + 1 = 7.
 */
public class 统计全为1的正方形子矩阵 {

	public static void main(String[] args) {
		int[][] matrix = {{0,1,1,1},{1,1,1,1},{0,1,1,1}};
		//int[][] matrix = {{0,1,1,1,1},{1,1,1,1,1},{0,1,1,1,1},{0,1,1,1,1}};
		System.out.println(countSquares(matrix));
	}
	
    public static int countSquares(int[][] matrix) {
    	if(matrix == null || matrix.length == 0){
    		return 0;
    	}
    	int row = matrix.length;
    	int col = matrix[0].length;
    	//dp[i][j]代表以ij为右下角的最大正方形的大小
    	int[][] dp = new int[row][col];
    	int count = 0;
    	for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if(matrix[i][j] == 0){
					continue;
				}
				if(i == 0 || j == 0){
					dp[i][j] = 1;
					count ++;
					continue;
				}
				dp[i][j] = Math.min(Math.min(dp[i-1][j-1], dp[i-1][j]), dp[i][j-1])+1;
				count += dp[i][j];
			}
		}
		return count;
    }

}
