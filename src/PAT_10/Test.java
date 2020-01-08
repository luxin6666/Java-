package PAT_10;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

	public static void main(String[] args) throws IOException {
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("请输入歌词(以空格分隔）：");
		String str = buf.readLine();
		String[] s = str.split(" ");
		for (String string : s) {
		    System.out.println(string);
		}
	}
	
}
