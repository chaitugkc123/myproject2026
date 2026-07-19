package JavaProgramsPractice;

public class Array_MissingNoinArray {

	public static void main(String[] args) {
		int sum=0,tot_sum = 0,missingno;
		//Array should not have duplicates
		//Array no need to be sorted order
		//values should be in range
		int arr1[]= {1,2,4,5};
		for(int i=0;i<arr1.length;i++) {
		sum=sum+arr1[i];
		}
		System.out.println("Sum of elements in Array:"+sum);
//missing no=tot_sum of elements in series -no of elements provided in array
		for(int i=1;i<=5;i++) {
		tot_sum=tot_sum+i;
		}
		System.out.println(tot_sum);
		missingno=tot_sum-sum;
		System.out.println("Missing element in Array"+missingno);
	}

}
