package JavaProgramsPractice;

public class Swapping2Numbers {

	public static void main(String[] args) {
		
		int a=10,b=20,temp;
		
		/*
		 * a=a+b; b=a-b; a=a-b;
		 */
		
		//2nd Approach:
		/*
		 * a=a*b; b=a/b; a=a/b;
		 */
		
		//3rd Approach:using third variable:
		/*temp=a;
		a=b;
		b=temp;*/
		
		//Approach 4: //single statement:
		
		b=a+b-(a=b);
		
		System.out.println("Values after Swapping:"+a+" "+b);
	}

}
