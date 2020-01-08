package 剑指Offer;

import java.util.ArrayList;

/*
 *	把只包含质因子2、3和5的数称作丑数（Ugly Number）。
 *	例如6、8都是丑数，但14不是，因为它包含质因子7。 习惯上我们把1当做是第一个丑数。求按从小到大的顺序的第N个丑数。
 *
 *	思路：丑数  = 2^x * 3^y * 5^z	(x,y,z均不小于0)
		 1*2 , 1*3 , 1*5 --> min:1*2=2;
		 2*2 , 1*3 , 1*5 --> min:1*3=3;
		 2*2 , 2*3 , 1*5 --> min:2*2=4;
		 3*2 , 2*3 , 1*5 --> min:1*5=5;
		 3*2 , 2*3 , 2*5 --> min:2*3=6;
		 4*2 , 3*3 , 2*5 --> min:2*4=8;
		 5*2 , 3*3 , 2*5 --> min:3*3=9;
		
 */

public class Test33_丑数 {
	
	public static void main(String[] args) {
		System.out.println(GetUglyNumber_Solution(6));
	}

    public static int GetUglyNumber_Solution(int index) {
    	if(index <= 0){
    		return 0;
    	}
    	ArrayList<Integer> list = new ArrayList<>();
    	list.add(1);
    	int a = 0, b = 0, c = 0;
    	int x1 = 0, x2 = 0, x3 = 0;
    	int min = 0;
    	while(list.size() < index){
    		x1 = list.get(a)*2;
    		x2 = list.get(b)*3;
    		x3 = list.get(c)*5;
    		min = Math.min(x1, Math.min(x2, x3));
    		list.add(min);
    		if(min == x1){
    			a++;
    		}
    		if(min == x2){
    			b++;
    		}
    		if(min == x3){
    			c++;
    		}
    	}
        return list.get(index-1);
    }

}
