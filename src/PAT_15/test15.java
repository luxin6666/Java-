package PAT_15;

import java.util.Scanner;

/*
 * 单词长度 （15 分）
你的程序要读入一行文本，其中以空格分隔为若干个单词，以.结束。你要输出每个单词的长度。
这里的单词与语言无关，可以包括各种符号，比如it's算一个单词，长度为4。
注意，行中可能出现连续的空格；最后的.不计算在内。

输入格式：
输入在一行中给出一行文本，以.结束

提示：用scanf("%c",...);来读入一个字符，直到读到.为止。

输出格式：
在一行中输出这行文本对应的单词的长度，每个长度之间以空格隔开，行末没有最后的空格。

输入样例：
It's great to see you here.
输出样例：
4 5 2 3 3 4
 */
public class test15 {

    public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String line = input.nextLine();
		//去掉重复的空格
		String s = "";
		for(int i=0; i<line.length(); i++){
			if((int)line.charAt(i)==32 && (int)line.charAt(i+1)==32){
				continue;
			}
			s = s + line.charAt(i);
		}
		line = s.trim();
		//System.out.println(line);
		/*if((int)line.charAt(line.length()-1)!=32){
			s = s + line.charAt(line.length()-1);
		}*/
		//System.out.println(s);
		String[] a = line.split(" ");
		/*for (String string : a) {
			System.out.print(string+"-->");
		}*/
		//System.out.println(a.length);
		for(int i=0; i<a.length; i++){
			if(a[i].equals(".")){
				break;
			}
			if(i==0 && a.length!=1){
				System.out.print(a[i].length());
				//System.out.println("*");
			}else if(a.length == 1){
				System.out.println(a[i].length()-1);
				//System.out.println("#");
			}
			else if(i==a.length-1){
				System.out.println(" "+(a[i].length()-1));
				//System.out.println(a[i]);
				//System.out.println("$");
			}else{
				System.out.print(" "+a[i].length());
				//System.out.println("%");
			}
		}
	}

}