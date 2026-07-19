package JavaProgramsPractice;

public class ReverseNumber {
	

	public static void main(String[] args) {
		int num=12321;
				//int rev=0;
		
		/*while(num>0) {
		rev=rev*10+num%10;
		num=num /10;
		}
		*/
		//Approach 2: StringBuffer reverse method:
		/*StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();*/
		
		//Approach 3: StringBuilder method reverse method:
		StringBuilder sbb=new StringBuilder(String.valueOf(num));
		StringBuilder rev=sbb.reverse();
		System.out.println("Print reverese no:" +rev);

	}

}
