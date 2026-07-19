package JavaProgramsPractice;

public class String_RemoveSpecialCharacters {

	public static void main(String[] args) {
	
		String str="$$Krishna!!%%";
			
			//remove special character:
			str=str.replaceAll("[^a-zA-Z0-9]","");
			System.out.println(str);
			
			String str2=" Lord   Krishna";
			str2=str2.replaceAll(" ", "");
			System.out.println(str2);
			
			//System.out.println(str2.trim());
		}

	}


