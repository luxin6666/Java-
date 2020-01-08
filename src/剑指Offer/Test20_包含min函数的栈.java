package 剑指Offer;

import java.util.Stack;

/*
 *	定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 */

public class Test20_包含min函数的栈 {
	
	public static Stack<Integer> stack1 = new Stack<>();
	public static Stack<Integer> stack2 = new Stack<>();
	
	public static void main(String[] args) {
		stack1.push(5);
		stack1.push(-3);
		stack1.push(3);
		stack1.push(6);
		stack1.push(2);
	}

	public static void push(int node) {
		stack1.push(node);
        if(stack2.empty() || node <= stack2.peek()){
        	stack2.push(node);
        }
    }
    
    public static void pop() {
        if(stack1.peek() == stack2.peek()){
        	stack1.pop();
        	stack2.pop();
        }else{
        	stack1.pop();
        }
    }
    
    public static int top() {
		return stack1.peek();
    }
    
    public static int min() {
		return stack2.peek();
    }
	
}
