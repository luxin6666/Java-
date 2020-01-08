package 剑指Offer;

import java.util.ArrayList;
import java.util.List;

/*
 *	给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。不能使用除法。
 */

public class Test51_构建乘积数组 {
	
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6};
		int[] number = multiply(numbers);
		for (int i : number) {
			System.out.print(i+",");
		}
	}
	
    public static int[] multiply(int[] A) {
    	List<Integer> list = new ArrayList<Integer>();
    	for(int i=0; i<A.length; i++){
    		int sum = 1;
    		for(int j=0; j<A.length; j++){
    			if(i == j){
    				continue;
    			}
    			sum = sum * A[j];
    		}
    		list.add(sum);
    	}
    	int[] a = new int[list.size()];
    	for(int i=0; i<list.size(); i++){
    		a[i] = list.get(i);
    	}
		return a;
    }
    
}
