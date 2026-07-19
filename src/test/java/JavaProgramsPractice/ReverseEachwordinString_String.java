package JavaProgramsPractice;

import java.util.Arrays;

public class ReverseEachwordinString_String {

	public static void main(String[] args) {
		String str="Welcome to Java";
		
		String words[]=str.split(" ");
		
		//String w=Arrays.toString(words);
		//System.out.println(w);
		//System.out.println(""+words);
		//String reverseStrring="";
		
		String reverseString=" ";
		for(String w:words) {
			String reverseword="";
			for(int i=w.length()-1;i>=0;i--) {
				reverseword=reverseword+w.charAt(i);	
			}
			
			reverseString=reverseString+reverseword+" ";
			
		}
		System.out.println(reverseString);
	}
}