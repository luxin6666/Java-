package 剑指Offer;

import java.util.ArrayList;

/*
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 */

public class Test19_顺时针打印矩阵 {
	
	public static void main(String[] args) {
		int[][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		//int[][] matrix = {{1},{2},{3},{4},{5}};
		ArrayList<Integer> list = printMatrix(matrix);
		System.out.println(list.toString());
	}
	
	public static ArrayList<Integer> printMatrix(int [][] matrix) {
		int left=0;
		int right=matrix[0].length-1;
		int top=0;
		int boom= matrix.length-1;//记录四个角的位置
        ArrayList<Integer> list = new ArrayList<Integer>();
        while((right>left)&&(boom>top)){
            for(int i=left; i<=right; i++){//从左上到右上
                list.add(matrix[top][i]);
            }
            for(int i=top+1; i<=boom; i++){//从右上到右下
                list.add(matrix[i][right]);
            }
            for(int i=right-1; i>=left; i--){//从右下到左下
                list.add(matrix[boom][i]);
            }
            for(int i=boom-1; i>top; i--){//从左下到左上
                list.add(matrix[i][left]);
            }
            left++;
            right--;
            top++;
            boom--;
        }

        if((boom==top)&&(left<right)){//单独剩下一行的情况
            for(int i=left; i<=right; i++){
                list.add(matrix[top][i]);
            }
        }
        if((left==right)&&(boom>top)){//单独剩下一列的情况
            for(int i =top; i<= boom; i++){
                list.add(matrix[i][left]);
            }
        }
         if((boom==top)&&(right==left)){//单独剩下一个元素的情况
           list.add(matrix[left][boom]); 
        }
        return list;
    }
	
	
	

	/*public static ArrayList<Integer> printMatrix(int [][] matrix) {
		ArrayList<Integer> result = new ArrayList<Integer>();
		int row = matrix.length;
		int col = matrix[0].length;
		//层数
		int len = (Math.min(row, col)-1)/2+1;
		for(int i=0; i<len; i++){
			//从左上到右上
			for(int k=i; k<col-i; k++){
				result.add(matrix[i][k]);
			}
			//从右上到右下
			for(int j=i+1; j<row-i; j++){
				result.add(matrix[j][col-i-1]);
			}
			//从右下到左下
			for(int m=col-i-2; (m>=i)&&(row-i-1!=i); m--){
				result.add(matrix[row-i-1][m]);
			}
			//从左下到左上
			for(int n=row-i-2; (n>i)&&(col-i-1!=i); n--){
				result.add(matrix[n][i]);
			}
		}
		return result;
    }*/
	
}
