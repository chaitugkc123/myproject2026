package JavaProgramsPractice;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataIntoTextFile {

	public static void main(String[] args) throws IOException {
		
		FileWriter fw=new FileWriter("D:\\DesktopNov2019\\Test2.txt");
		BufferedWriter bw= new BufferedWriter(fw);
		bw.write("Welcome to selenium java");
		bw.write("Practice Daily");
		System.out.println("Finished!!");
		bw.close();
	}
	

}
