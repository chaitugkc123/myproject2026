package JavaProgramsPractice;

public class CountNoofwordsin_String {

	public static void main(String[] args) {
		int count=0;
		String str="Do java practice consistently";
		String arr[]=str.split(" ");
		
		
		
		for(int i=0;i<arr.length;i++) {
		count++;
		}
		System.out.println("Count no of words in String:"+count);
		
		
		//try pavan sir logic in future
	}

}
