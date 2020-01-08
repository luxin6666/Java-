package 剑指Offer;

import java.util.ArrayList;

/*
 *	小明很喜欢数学,有一天他在做数学作业时,要求计算出9~16的和,他马上就写出了正确答案是100。
 *	但是他并不满足于此,他在想究竟有多少种连续的正数序列的和为100(至少包括两个数)。
 *	没多久,他就得到另一组连续正数和为100的序列:18,19,20,21,22。
 *	现在把问题交给你,你能不能也很快的找出所有和为S的连续正数序列? Good Luck!
 *
 *	输出描述:
 *	输出所有和为S的连续正数序列。序列内按照从小至大的顺序，序列间按照开始数字从小到大的顺序
 */

public class Test41_和为S的连续正数序列 {
	
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> arrayList = FindContinuousSequence(100);
		for (ArrayList<Integer> list : arrayList) {
			System.out.println(list);
		}
	}
	
    public static ArrayList<ArrayList<Integer> > FindContinuousSequence(int sum) {
    	ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();
    	ArrayList<Integer> list = new ArrayList<>();
    	if(sum <= 2){
    		return arrayList;
    	}
    	int s = sum;
    	for(int i=1; i<sum; i++){
    		boolean flag = false;
    		for(int j=i; j<sum; j++){
	    		s = s - j;
	    		if(s == 0){
	    			for(int k=i; k<=j; k++){
	    				list.add(k);
	    			}
	    			flag = true;
	    			break;
	    		}
	    		if(s < 0){
	    			break;
	    		}
    		}
    		if(flag == true){
    			arrayList.add(list);
    			list = new ArrayList<>();
    		}
    		s = sum;
    	}
		return arrayList;
    }
    
}
