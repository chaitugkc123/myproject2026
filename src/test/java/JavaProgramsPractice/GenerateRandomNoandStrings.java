package JavaProgramsPractice;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class GenerateRandomNoandStrings {

	public static void main(String[] args) {
		
		Random rd =new Random();
			int randno=rd.nextInt(100);
			System.out.println(randno);
			
			double randd=rd.nextDouble(50.0);
			System.out.println(randd);
			
			//Random Numeric
			String randn=RandomStringUtils.randomNumeric(5);
			System.out.println(randn);
			//Random String
			String RandA=RandomStringUtils.randomAlphabetic(5);
			System.out.println(RandA);
			
			
		}

	}


