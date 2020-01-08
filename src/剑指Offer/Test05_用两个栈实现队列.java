package 剑指Offer;

import java.util.Stack;

/*
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 */

public class Test05_用两个栈实现队列 {
	
	static Stack<Integer> stack1 = new Stack<Integer>();
	static Stack<Integer> stack2 = new Stack<Integer>();

	public static void main(String[] args) {
		stack1.push(2);
		stack1.push(4);
		stack1.push(8);
		Integer n = stack2.pop();
		System.out.println(n);
	}

    public static void push1(int node) {
        stack1.push(node);
    }
    
    public static int pop1() {
    	Integer num = null;
    	if(!stack2.empty()){
    		num = stack2.pop();
    	}else{
    		while(!stack1.empty()){
    			num = stack1.pop();
    			stack2.push(num);
    		}
    		if(!stack2.empty()){
    			num = stack2.pop();
    		}
    	}
    	return num.intValue();
    }
	
}
