package 力扣LeetCode;

/*
这里有一幅服务器分布图，服务器的位置标识在 m * n 的整数矩阵网格 grid 中，1 表示单元格上有服务器，0 表示没有。
如果两台服务器位于同一行或者同一列，我们就认为它们之间可以进行通信。
请你统计并返回能够与至少一台其他服务器进行通信的服务器的数量。

示例 1：
输入：grid = [[1,0],[0,1]]
输出：0
解释：没有一台服务器能与其他服务器进行通信。

示例 2：
输入：grid = [[1,0],[1,1]]
输出：3
解释：所有这些服务器都至少可以与一台别的服务器进行通信。

示例 3：
输入：grid = [[1,1,0,0],[0,0,1,0],[0,0,1,0],[0,0,0,1]]
输出：4
解释：第一行的两台服务器互相通信，第三列的两台服务器互相通信，但右下角的服务器无法与其他服务器通信。
 */
public class 统计参与通信的服务器 {

	public static void main(String[] args) {
		int[][] grid = {{1,1,0,0},{0,0,1,0},{0,0,1,0},{0,0,0,1}};
		System.out.println(countServers(grid));
	}
	
    public static int countServers(int[][] grid) {
    	int count = 0;
    	int[] row = new int[grid.length];	// 统计某一行的服务器数量
    	int[] col = new int[grid[0].length];	// 统计某一列的服务器数量
    	for(int i=0; i<row.length; i++){
    		for (int j = 0; j < col.length; j++) {
				if(grid[i][j] == 0){
					continue;
				}
				row[i]++;
				col[j]++;
			}
    	}
    	for (int i = 0; i < row.length; i++) {
			for (int j = 0; j < col.length; j++) {
				if(grid[i][j] == 0){
					continue;
				}
				if(row[i] == 1 && col[j] == 1){
					continue;
				}
				count++;
			}
		}
		return count;
    }

}
