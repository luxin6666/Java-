package PAT_15;

import java.util.Scanner;

/*
 * 念数字 （15 分）
输入一个整数，输出每个数字对应的拼音。当整数为负数时，先输出fu字。十个数字对应的拼音如下：

0: ling
1: yi
2: er
3: san
4: si
5: wu
6: liu
7: qi
8: ba
9: jiu
输入格式：
输入在一行中给出一个整数，如：1234。

提示：整数包括负数、零和正数。

输出格式：
在一行中输出这个整数对应的拼音，每个数字的拼音之间用空格分开，行末没有最后的空格。如 yi er san si。

输入样例：
-600
输出样例：
fu liu ling ling
 */
public class test14 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		for(int i=0; i<line.length(); i++){
			switch(line.charAt(i)){
			case '-':
				if(i == line.length()-1){
					System.out.print("fu");
				}else{
					System.out.print("fu"+" ");
				}
				break;
			case '0':
				if(i == line.length()-1){
					System.out.print("ling");
				}else{
					System.out.print("ling"+" ");
				}
				break;
			case '1':
				if(i == line.length()-1){
					System.out.print("yi");
				}else{
					System.out.print("yi"+" ");
				}
				break;
			case '2':
				if(i == line.length()-1){
					System.out.print("er");
				}else{
					System.out.print("er"+" ");
				}
				break;
			case '3':
				if(i == line.length()-1){
					System.out.print("san");
				}else{
					System.out.print("san"+" ");
				}
				break;
			case '4':
				if(i == line.length()-1){
					System.out.print("si");
				}else{
					System.out.print("si"+" ");
				}
				break;
			case '5':
				if(i == line.length()-1){
					System.out.print("wu");
				}else{
					System.out.print("wu"+" ");
				}
				break;
			case '6':
				if(i == line.length()-1){
					System.out.print("liu");
				}else{
					System.out.print("liu"+" ");
				}
				break;
			case '7':
				if(i == line.length()-1){
					System.out.print("qi");
				}else{
					System.out.print("qi"+" ");
				}
				break;
			case '8':
				if(i == line.length()-1){
					System.out.print("ba");
				}else{
					System.out.print("ba"+" ");
				}
				break;
			case '9':
				if(i == line.length()-1){
					System.out.print("jiu");
				}else{
					System.out.print("jiu"+" ");
				}
				break;
		    }
	    }

	}
}
