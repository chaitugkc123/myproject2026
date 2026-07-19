package JavaProgramsPractice;

public class Array_DuplicateElementsfinding {

	public static void main(String[] args) {
	int count = 0;
		int arr1[]= {10,20,10,30,50,75,50,75};
		boolean flag=true;
		for(int i=0;i<=arr1.length-1;i++) {
			for(int j=i+1;j<=arr1.length-1;j++) {
			if(arr1[i]==arr1[j]) {
				count++;
				System.out.println("Duplicate elements:"+count+" "+arr1[i]);
				flag=true;
			}
		
		}
		}
		if(flag==false) {
			System.out.println("Duplicate elements not found");
		//need to try pavan sir examples..  as mandate
		
		

	}

}
	
}
