package PAT_15;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/*
 *  复数四则运算 （15 分）
本题要求编写程序，计算2个复数的和、差、积、商。

输入格式：
输入在一行中按照a1 b1 a2 b2的格式给出2个复数C1=a1+b1i和C2=a2+b2i的实部和虚部。题目保证C2不为0。

输出格式：
分别在4行中按照(a1+b1i) 运算符 (a2+b2i) = 结果的格式顺序输出2个复数的和、差、积、商，数字精确到小数点后1位。
如果结果的实部或者虚部为0，则不输出。如果结果为0，则输出0.0。

输入样例1：
2 3.08 -2.04 5.06
输出样例1：
(2.0+3.1i) + (-2.0+5.1i) = 8.1i
(2.0+3.1i) - (-2.0+5.1i) = 4.0-2.0i
(2.0+3.1i) * (-2.0+5.1i) = -19.7+3.8i
(2.0+3.1i) / (-2.0+5.1i) = 0.4-0.6i
输入样例2：
1 1 -1 -1.01
输出样例2：
(1.0+1.0i) + (-1.0-1.0i) = 0.0
(1.0+1.0i) - (-1.0-1.0i) = 2.0+2.0i
(1.0+1.0i) * (-1.0-1.0i) = -2.0i
(1.0+1.0i) / (-1.0-1.0i) = -1.0
 */
public class test17_difficult {

	public static String formatNum(float num){
		DecimalFormat decimalFormat = new DecimalFormat("0.0");//构造方法的字符格式这里如果小数不足2位,会以0补足.
		String str = decimalFormat.format(num);
		return str;
	}
	
	public static void add(String a,String b,String c,String d){
		String aa = formatNum(Float.parseFloat(a)+Float.parseFloat(c));
		String bb = formatNum(Float.parseFloat(b)+Float.parseFloat(d));
		if(aa.equals("0.0") && !bb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" + ("+c+d+"i) = "+bb+"i");
			}else{
				System.out.println("("+a+"+"+b+"i)"+" + ("+c+"+"+d+"i) = "+bb+"i");
			}
		} 
		if(!aa.equals("0.0") && bb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" + ("+c+d+"i) = "+aa);
			}else{
				System.out.println("("+a+"+"+b+"i)"+" + ("+c+"+"+d+"i) = "+aa);
			}
		} 
		if(!aa.equals("0.0") && !bb.equals("0.0")){
			if(bb.charAt(0)=='-'){
				if(d.charAt(0)=='-'){
					System.out.println("("+a+"+"+b+"i)"+" + ("+c+d+"i) = "+aa+bb+"i");
				}else{
					System.out.println("("+a+"+"+b+"i)"+" + ("+c+"+"+d+"i) = "+aa+bb+"i");
				}
			}else{
				if(d.charAt(0)=='-'){
					System.out.println("("+a+"+"+b+"i)"+" + ("+c+d+"i) = "+aa+"+"+bb+"i");
				}else{
					System.out.println("("+a+"+"+b+"i)"+" + ("+c+"+"+d+"i) = "+aa+"+"+bb+"i");
				}
			}
			
		}
		if(aa.equals("0.0") && bb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" + ("+c+d+"i) = "+"0.0");
			}else{
				System.out.println("("+a+"+"+b+"i)"+" + ("+c+"+"+d+"i) = "+"0.0");
			}
		}
	}
	
	public static void reduce(String a,String b,String c,String d){
		String aa = formatNum(Float.parseFloat(a)-Float.parseFloat(c));
		String bb = formatNum(Float.parseFloat(b)-Float.parseFloat(d));
		if(aa.equals("0.0") && !bb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" - ("+c+d+"i) = "+bb+"i");
			}else{
				System.out.println("("+a+"+"+b+"i)"+" - ("+c+"+"+d+"i) = "+bb+"i");
			}
		} 
		if(!aa.equals("0.0") && bb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" - ("+c+d+"i) = "+aa);
			}else{
				System.out.println("("+a+"+"+b+"i)"+" - ("+c+"+"+d+"i) = "+aa);
			}
		} 
		if(!aa.equals("0.0") && !bb.equals("0.0")){
			if(bb.charAt(0)=='-'){
				if(d.charAt(0)=='-'){
					System.out.println("("+a+"+"+b+"i)"+" - ("+c+d+"i) = "+aa+bb+"i");
				}else{
					System.out.println("("+a+"+"+b+"i)"+" - ("+c+"+"+d+"i) = "+aa+bb+"i");
				}
			}else{
				if(d.charAt(0)=='-'){
					System.out.println("("+a+"+"+b+"i)"+" - ("+c+d+"i) = "+aa+"+"+bb+"i");
				}else{
					System.out.println("("+a+"+"+b+"i)"+" - ("+c+"+"+d+"i) = "+aa+"+"+bb+"i");
				}
			}
			
		}
		if(aa.equals("0.0") && bb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" - ("+c+d+"i) = "+"0.0");
			}else{
				System.out.println("("+a+"+"+b+"i)"+" - ("+c+"+"+d+"i) = "+"0.0");
			}
		}
	}
	
	public static void ride(String a,String b,String c,String d){
		String aa = formatNum(Float.parseFloat(a)*Float.parseFloat(c)+(0-Float.parseFloat(b)*Float.parseFloat(d)));
		String bb = formatNum(Float.parseFloat(a)*Float.parseFloat(d)+Float.parseFloat(b)*Float.parseFloat(c));
		if(aa.equals("0.0") && !bb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" * ("+c+d+"i) = "+bb+"i");
			}else{
				System.out.println("("+a+"+"+b+"i)"+" * ("+c+"+"+d+"i) = "+bb+"i");
			}
		} 
		if(!aa.equals("0.0") && bb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" * ("+c+d+"i) = "+aa);
			}else{
				System.out.println("("+a+"+"+b+"i)"+" * ("+c+"+"+d+"i) = "+aa);
			}
		} 
		if(!aa.equals("0.0") && !bb.equals("0.0")){
			if(bb.charAt(0)=='-'){
				if(d.charAt(0)=='-'){
					System.out.println("("+a+"+"+b+"i)"+" * ("+c+d+"i) = "+aa+bb+"i");
				}else{
					System.out.println("("+a+"+"+b+"i)"+" * ("+c+"+"+d+"i) = "+aa+bb+"i");
				}
			}else{
				if(d.charAt(0)=='-'){
					System.out.println("("+a+"+"+b+"i)"+" * ("+c+d+"i) = "+aa+"+"+bb+"i");
				}else{
					System.out.println("("+a+"+"+b+"i)"+" * ("+c+"+"+d+"i) = "+aa+"+"+bb+"i");
				}
			}
			
		}
		if(aa.equals("0.0") && bb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" * ("+c+d+"i) = "+"0.0");
			}else{
				System.out.println("("+a+"+"+b+"i)"+" * ("+c+"+"+d+"i) = "+"0.0");
			}
		}
	}
	/*
	 	(a+bi)/(c+di)， (b，d≠0)
		=[(ac+bd)/(c²+d²)] -[(ad-bc)/(c²+d²)]i
	 */
	public static void except(String a,String b,String c,String d){
		float ac = Float.parseFloat(a)*Float.parseFloat(c);
		float bd = Float.parseFloat(b)*Float.parseFloat(d);
		float ad = Float.parseFloat(a)*Float.parseFloat(d);
		float bc = Float.parseFloat(b)*Float.parseFloat(c);
		float cc = Float.parseFloat(c)*Float.parseFloat(c);
		float dd = Float.parseFloat(d)*Float.parseFloat(d);
		//System.out.println("ac="+ac+",bd="+bd+",ad="+ad+",bc="+bc);
		//System.out.println("ad-bc="+(ad-bc));
		String aaa = formatNum((ac+bd)/(cc+dd));
		String bbb = formatNum((ad-bc)/(cc+dd));
		if(aaa.equals("0.0") && !bbb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" / ("+c+d+"i) = -"+bbb+"i");
			}else{
				System.out.println("("+a+"+"+b+"i)"+" / ("+c+"+"+d+"i) = -"+bbb+"i");
			}
		} 
		if(!aaa.equals("0.0") && bbb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" / ("+c+d+"i) = "+aaa);
			}else{
				System.out.println("("+a+"+"+b+"i)"+" / ("+c+"+"+d+"i) = "+aaa);
			}
		} 
		if(!aaa.equals("0.0") && !bbb.equals("0.0")){
			if(bbb.charAt(0)=='-'){
				if(d.charAt(0)=='-'){
					System.out.println("("+a+"+"+b+"i)"+" / ("+c+d+"i) = "+aaa+"-"+bbb+"i");
				}else{
					System.out.println("("+a+"+"+b+"i)"+" / ("+c+"+"+d+"i) = "+aaa+"-"+bbb+"i");
				}
			}else{
				if(d.charAt(0)=='-'){
					System.out.println("("+a+"+"+b+"i)"+" / ("+c+d+"i) = "+aaa+"-"+bbb+"i");
				}else{
					System.out.println("("+a+"+"+b+"i)"+" / ("+c+"+"+d+"i) = "+aaa+"-"+bbb+"i");
				}
			}
			
		}
		if(aaa.equals("0.0") && bbb.equals("0.0")){
			if(d.charAt(0)=='-'){
				System.out.println("("+a+"+"+b+"i)"+" / ("+c+d+"i) = "+"0.0");
			}else{
				System.out.println("("+a+"+"+b+"i)"+" / ("+c+"+"+d+"i) = "+"0.0");
			}
		}
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); 
		String line = input.nextLine();
		String[] a = line.split(" "); 
		float a1 = Float.parseFloat(a[0]); 
		float b1 = Float.parseFloat(a[1]); 
		float a2 = Float.parseFloat(a[2]); 
		float b2 = Float.parseFloat(a[3]);
		String aa1 = formatNum(a1);
		String bb1 = formatNum(b1);
		String aa2 = formatNum(a2);
		String bb2 = formatNum(b2);
		//加
		add(aa1, bb1, aa2, bb2);
		//减
		reduce(aa1, bb1, aa2, bb2);
		//乘
		ride(aa1, bb1, aa2, bb2);
		//除
		except(aa1, bb1, aa2, bb2);
	}
	
}
