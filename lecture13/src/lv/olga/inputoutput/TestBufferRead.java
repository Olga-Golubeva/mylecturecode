package lv.olga.inputoutput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class TestBufferRead {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		File file = new File("Data.txt");
		FileReader filReader = new FileReader(file);
		
		
		BufferedReader buffReader = new BufferedReader(filReader);
		
		String stringFileData;
		
		while((stringFileData = buffReader.readLine()) != null){
			System.out.println(stringFileData);
		}

	}

}
