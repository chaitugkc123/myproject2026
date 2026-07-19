package JavaProgramsPractice;

public class Array_SearchingElementinArray {

	public static void main(String[] args) {
		boolean flag=false;
		int arr1[]= {10,20,30,50,75,30};
		int Search_element=30;
		for(int i=0;i<arr1.length;i++) {
		if(arr1[i]==Search_element) {
			System.out.println("Search element found"+arr1[i]);
			flag=true;
			break;
			}
		}
		if(flag==false) {
System.out.println("Search element not found:"+Search_element);
		}
	}

}
