package JavaProgramsPractice;

import java.util.Scanner;

public class FindLargestof3Numbers {

	public static void main(String[] args) {
	
		//int a=10,b=20,c=30;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		System.out.println("Enter c value:");
		int c=sc.nextInt();
		
		//Approach 2:ternary operator;
		/*int largest1=a>b?a:b;
		int largest2=c>largest1?c:largest1;
		System.out.println(largest2+"largest no:"
				);*/
		if(a>b && a>c) {
			System.out.println("a is greater"+a);
		}
		else if(b>c && b>a){
	System.out.println("b is greater"+b);
		}
		else {
			System.out.println("c is greater");
		}
	}

}
