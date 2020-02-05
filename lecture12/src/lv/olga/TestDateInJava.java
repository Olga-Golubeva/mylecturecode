package lv.olga;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDateInJava {

	
	public static void main(String[] args) {
		
		LocalDateTime myDateObj = LocalDateTime.now();
	
		System.out.println("Time in machine: " +myDateObj);
		
		DateTimeFormatter myFormatObjTime = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		String formateDate = myDateObj.format(myFormatObjTime);
		
		System.out.println("After format time: " + formateDate);
	}

}
