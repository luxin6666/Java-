package 剑指Offer;

/*
 *	牛客最近来了一个新员工Fish，每天早晨总是会拿着一本英文杂志，写些句子在本子上。
 *	同事Cat对Fish写的内容颇感兴趣，有一天他向Fish借来翻看，但却读不懂它的意思。
 *	例如，“student. a am I”。后来才意识到，这家伙原来把句子单词的顺序翻转了，正确的句子应该是“I am a student.”。
 *	Cat对一一的翻转这些单词顺序可不在行，你能帮助他么？
 */

public class Test44_翻转单词顺序列 {
	
	public static void main(String[] args) {
		String s = "student. a am I";
		System.out.println(ReverseSentence(s));
	}
	
    public static String ReverseSentence(String str) {
    	if(str.trim().equals("")){
    		return str;
    	}
    	String[] s = str.split(" ");
    	StringBuffer sb = new StringBuffer();
    	for(int i=s.length-1; i>=0; i--){
    		sb.append(s[i]+" ");
    	}
    	sb.deleteCharAt(sb.length()-1);
		return new String(sb);
    }
    
}
