package lv.olga.inputoutput;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileReader {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		
		FileReader fr = new FileReader("Data.txt");
		
		int i;
		char test = 100;
		
		System.out.println(test);
		
		while((i = fr.read()) != -1){
			System.out.print((char)i);
		}

	}

}
