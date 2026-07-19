package JavaProgramsPractice;

public class CheckPrimeorNot {

	public static void main(String[] args) {
		int num=17;
				int count=0;
		if(num>1) {
			for(int i=1;i<=num;i++) {
		
				if(num%i==0) {
					count++;
					System.out.println("Count"+count);
					}
			}
					if(count==2) {
						System.out.println("prime no");
					}
					else {
						System.out.println("Not prime no");
						}
				}
		else {
			System.out.println("Given no is not prime no");
		}
	}
}		
			
		
		
	


