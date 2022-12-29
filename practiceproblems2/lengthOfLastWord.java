package practiceproblems2;

public class lengthOfLastWord {

	public  int lengthofLastWord (String s) {
		int i = s.length()-1,length=0;
		
		while(i>=0 && s.charAt(i)==' ')i--;
		while(i>=0 && s.charAt(i)!=' ') {
			length++;
			i--;
		}
		return length;
	}
	
public static void main(String[] args)
{
    String input = "Hello world   ";
    lengthOfLastWord obj = new  lengthOfLastWord();
    System.out.println("The length of last word is " + obj.lengthofLastWord(input));
}
}
		