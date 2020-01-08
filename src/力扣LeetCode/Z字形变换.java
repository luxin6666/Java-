package 力扣LeetCode;

/*
将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：

L   C   I   R
E T O E S I I G
E   D   H   N
之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："LCIRETOESIIGEDHN"。
请你实现这个将字符串进行指定行数变换的函数：
string convert(string s, int numRows);

示例 1:
输入: s = "LEETCODEISHIRING", numRows = 3
输出: "LCIRETOESIIGEDHN"
L   C   I   R  
E T O E S I I G
E   D   H   N

示例 2:
输入: s = "LEETCODEISHIRING", numRows = 4
输出: "LDREOEIIECIHNTSG"
解释:
L     D     R
E   O E   I I
E C   I H   N
T     S     G
 */
public class Z字形变换 {

	public static void main(String[] args) {
		String str = "LEETCODEISHIRING";
		int numRows = 3;
		System.out.println(convert(str, numRows));
	}
	
    public static String convert(String s, int numRows) {
    	//数组长度
    	int len = s.length();
    	if(numRows == 1){
    		return s;
    	}
    	//转换为数组
    	char[] ch = new char[len];
    	//数组下标
    	int index = 0;
    	for(int i=0; i<numRows; i++){
    		//列数
    		int count = 0;
    		while(true){
    			//第一行与最后一行的规则相同，但不同于中间几行
    			if(i>0 && i<numRows-1){
    				//获取下标
    				int indexNum = (numRows*2-2)*count-i;
    				if(indexNum >= len){
        				break;
        			}
    				if(indexNum > 0){
    					ch[index] = s.charAt(indexNum);
    					index++;
    				}
    			}
    			//获取下标
    			int indexNum = (numRows*2-2)*count+i;
    			if(indexNum >= len){
    				break;
    			}
    			ch[index] = s.charAt(indexNum);
    			index++;
    			count++;
    		}
    	}
		return String.copyValueOf(ch);
    }
	
}
/*
下标法：
numRows=3
0		4		8		12				(3+1)*0	(3+1)*1	(3+1)*2
1	3	5	7	9	11	13	15			(3+1)*0+-1[-1 1]	(3+1)*1+-1[3 5]	(3+1)*2+-1[7 9]
2		6		10		14				(3+1)*0+2	(3+1)*1+2	(3+1)*2+2

numRows=4
0			6			12				(4+2)*0	(4+2)*1	(4+2)*2
1		5	7		11	13				(4+2)*0+-1	(4+2)*1+-1	(4+2)*2+-1
2	4		8	10		14				(4+2)*0+-2	(4+2)*1+-2	(4+2)*2+-2
3			9			15				(4+2)*0+3	(4+2)*1+3	(4+2)*2+3

numRows=5
0				8				16		(5+3)*0
1			7	9			15	17		(5+3)*0+-1
2		6		10		14		18		(5+3)*0+-2
3	5			11	13			19		(5+3)*0+-3
4				12				20		(5+3)*0+4

numRows=6
0					10				18	20	(6+4)*0
1				9	11			17		21	(6+4)*0+-1
2			8		12		16			22	(6+4)*0+-2
3		7			13	15				23	(6+4)*0+-3
4	6				14					24	(6+4)*0+-4
5					15					25	(6+4)*0+5
 
*/ 