package lv.olga.inputoutput;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class TestEmailText {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		
		
//		String defaultStr = "Hello user userName";
//		String newStr = defaultStr.replace("userName", "");
//		
//		String [] names = {"Olga", "Toms", "Nika", "Raimonds"};
//		

//		
//		System.out.println(newStr + names[2]);
		
		// input usernames from scanner
		// input usernames from ArrayList
		
		File file = new File("defaultString.txt");
		
		
		Scanner sc = new Scanner(file);
		String stringFromTextFile = " ";
		 
		while(sc.hasNextLine()){
			stringFromTextFile = sc.nextLine();
		
	}
//		System.out.println("Check: " + stringFromTextFile);


	String lastStr = stringFromTextFile.replace("userName", " ");
	String userName = "Olga Golubeva";
	File fileForUser = new File(userName + ".txt"); 
	FileWriter fw = new FileWriter(fileForUser, true);
	fw.write(lastStr + userName);
	fw.write("\n String next line");
	
	fw.close();
	
	}
}