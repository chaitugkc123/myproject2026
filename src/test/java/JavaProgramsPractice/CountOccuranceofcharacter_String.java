package JavaProgramsPractice;

public class CountOccuranceofcharacter_String {

	public static void main(String[] args) {
		int count=0;
		String str="Do java practice consistently";
		/*-try-for(int i=0;i<=str.length();i++) {
		str.charAt(i);
		if(count>0) {
			count++;
		}
		*/
		
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++) {
		if(ch[i]>0) {
			count++;
		}
		}
		System.out.println("No of characters:"+count);
		
		String str1=str.replace("a", "");
		System.out.println(str1.length());
		System.out.println("The occurance of a:"+(str.length()-str1.length()));
		
		
	}

}
