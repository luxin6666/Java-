package 剑指Offer;

/*
 *	输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有的奇数位于数组的前半部分，所有的偶数位于数组的后半部分，
 *  并保证奇数和奇数，偶数和偶数之间的相对位置不变。
 */

public class Test13_调整数组顺序使奇数位于偶数前面 {
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		reOrderArray(arr);
		for (int i = 0; i < arr.length; i++) {
        	if(i == arr.length-1){
        		System.out.println(arr[i]);
        		return;
        	}
			System.out.print(arr[i]+",");
		}
	}
	
	public static void reOrderArray(int [] array) {
		int temp;
		for(int i=0; i<array.length; i++){
			for(int j=0; j<array.length-1; j++){
				if(array[j]%2==0 && array[j+1]%2==1){
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
    }
	
	/*public static void reOrderArray(int [] array) {
		int count = 0;
		int[] arr = new int[array.length];
        for(int i=0; i<array.length; i++){
        	if(array[i]%2 != 0){
        		arr[count] = array[i];
        		count++;
        	}
        }
        for(int i=0; i<array.length; i++){
        	if(array[i]%2 == 0){
        		arr[count] = array[i];
        		count++;
        	}
        }
        array = arr;
        for (int i = 0; i < arr.length; i++) {
        	if(i == arr.length-1){
        		System.out.println(arr[i]);
        		return;
        	}
			System.out.print(arr[i]+",");
		}
    }*/
	
}
