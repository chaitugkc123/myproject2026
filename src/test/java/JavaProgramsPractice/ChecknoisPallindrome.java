package JavaProgramsPractice;

import java.util.Scanner;

public class ChecknoisPallindrome {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter no:");
		//System.out.println(sc.nextInt());
		int num=sc.nextInt();
		
		int org_num=num;
		int rev = 0;
		while(num>0) {
			
		rev=rev*10+num%10;
		num=num/10;
		}
		System.out.println("Reverse no:" +rev);
		if(org_num==rev){
		System.out.println(+org_num+" "+"Pallindrome Number");
		}
		else {
			System.out.println(+org_num+" "+"Not Pallindrome Number");
		}
	}

}
