package lv.olga.inputoutput;

import java.io.File;
import java.io.FileWriter;

public class TestCreateAndWriteFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		
		File fileObj = new File("newfile.txt");
		FileWriter fw = new FileWriter(fileObj, true);
		fw.write("Check does it works?");
		fw.append("\n String next line");
		fw.close();
		
//		if(fileObj.createNewFile()){
//			System.out.println("File created: " + fileObj.getName());
//		}else{
//			System.out.println("File exists");
//		}
		
		
	}

}
