package 剑指Offer;

/*
 *	统计一个数字在排序数组中出现的次数。
 */

public class Test37_数组在排序树组中出现的次数 {
	
	public static void main(String[] args) {
		int[] arr = {1,3,4,3,5,6,3,5};
		System.out.println(GetNumberOfK(arr,3));
	}
	
    public static int GetNumberOfK(int [] array , int k) {
    	int count = 0;
    	for(int i=0; i<array.length; i++){
    		if(k == array[i]){
    			count++;
    		}
    	}
		return count;
    }

}
