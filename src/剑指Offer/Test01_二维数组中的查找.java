package 剑指Offer;

/*
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Test01_二维数组中的查找 {

	public static void main(String[] args) {
		int[][] arr = {{2,3,4,13},{4,5,6,12},{7,8,9,11}};
		boolean flag = find(11,arr);
		if(flag == true){
			System.out.println("this is true");
		}else{
			System.out.println("this is false");
		}
	}
	
	public static boolean find(int target, int [][] array) {
		int row = array.length;
		int col = array[0].length;
		for(int i=0; i<row; i++){
			for(int j=0; j<col; j++){
				if(array[i][j] == target){
					return true;
				}
			}
		}
		return false;
	}
	
}
