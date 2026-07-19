package JavaProgramsPractice;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ReadDatafromTextfile {

	public static void main(String[] args) throws IOException {
		
		/*FileReader fr= new FileReader("D:\\DesktopNov2019\\Maven commands.txt");
		//Desktop\\Test.txt
		//D:\DesktopNov2019\Maven commands.txt
		BufferedReader br =new BufferedReader(fr);
		String str;
		while((str=br.readLine())!=null) {
			System.out.println(str);
		}
br.close();*/
		
		//Approach2:
		File fl= new File("D:\\DesktopNov2019\\Maven commands.txt");
		Scanner sc =new Scanner(fl) ;
		/*while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}*/
		//Approach3: --
	sc.useDelimiter("\\Z");
	System.out.println(sc.next());
	}

}

