package PAT_10;
import java.util.Scanner;

/*
 * 用天平找小球 （10 分）
三个球A、B、C，大小形状相同且其中有一个球与其他球重量不同。要求找出这个不一样的球。

输入格式：
输入在一行中给出3个正整数，顺序对应球A、B、C的重量。

输出格式：
在一行中输出唯一的那个不一样的球。

输入样例：
1 1 2
输出样例：
C
 */
public class Test3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int A = input.nextInt();
		int B = input.nextInt();
		int C = input.nextInt();
		if(A == B){
			System.out.println("C");
		}
		if(A == C){
			System.out.println("B");
		}
		if(C == B){
			System.out.println("A");
		}
		
	}
	
}
