package 剑指Offer;

/*
 *	一个整型数组里除了两个数字之外，其他的数字都出现了两次。请写程序找出这两个只出现一次的数字。
 */

//	num1,num2分别为长度为1的数组。传出参数
//	将num1[0],num2[0]设置为返回结果
public class Test40_数组中只出现一次的数字 {
	
	public static void main(String[] args) {
		int[] arr = {2,3,8,3,5,2,8,9,4,4};
		int[] n1 = new int[1];
		int[] n2 = new int[1];
		FindNumsAppearOnce(arr, n1, n2);
	}
	
    public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        for(int i=0; i<array.length; i++){
        	boolean flag = false;
        	for(int j=0; j<array.length; j++){
        		if(i == j){
        			continue;
        		}else{
        			if(array[i] == array[j]){
        				flag = true;
        				break;
        			}
        		}
        	}
        	if(flag == false){
        		if(num1[0] == 0){
        			num1[0] = array[i];
        		}else{
        			num2[0] = array[i];
        		}
        	}
        }
    }
    
}
