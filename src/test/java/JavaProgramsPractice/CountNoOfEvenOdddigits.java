package JavaProgramsPractice;

public class CountNoOfEvenOdddigits {

	public static void main(String[] args) {
		int num=12345,even_count=0,odd_count=0;
		
		while(num>0) {
			if(num%2==0) {
				
				even_count++;
				
			}
			
			else{
				odd_count++;
			}
			
			num=num/10;
		}
		System.out.println("No of even digits:" +even_count);
		System.out.println("No of odd digits:" +odd_count);
				
	}

}
