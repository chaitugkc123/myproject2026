package JavaProgramsPractice;

public class ReverseString {

	public static void main(String[] args) {
		
		String str="Krishna",rev="";
		/*StringBuffer sb= new StringBuffer(str);
		System.out.println(sb.reverse());*/
		
		//Approach2 StringBuilder
		
		/*StringBuilder sbb=new StringBuilder(str);
			System.out.println(sbb.reverse());*/
		//--Approach3 using Character Array:
		/*char ch[]=str.toCharArray();
		System.out.println(ch.length);
		for(int j=ch.length-1;j>=0;j--) {
			rev=rev+ch[j];
		}
		System.out.println("Reverse String:--" +rev);
	}

	}*/
		System.out.println(str.length());
		for(int i=str.length()-1;i>=0;i--) {
		rev=rev+str.charAt(i);
		}
		System.out.println("Reverse String:" +rev);
	}

}

