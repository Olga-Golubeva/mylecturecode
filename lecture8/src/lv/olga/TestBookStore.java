package lv.olga;

import lv.olga.bookstore.Author;
import lv.olga.bookstore.Book;

public class TestBookStore {

	
	public static void main(String[] args) {
		
		Author rowling = new Author("J.K.Rowling", "rowling@gmail.com", 'f');
		Author rainis = new Author("Rainis", "rainis@gmail.com", 'm');
		Author test3 = new Author("name");
		
		System.out.println(rowling.getEmail());
		rowling.setEmail("row@gmail.com");
		System.out.println(rowling.getEmail());
		
		
		
		Book harrypotter = new Book("Harry Potter", rowling, 20.3, 1000);
		Book testBook = new Book("Test Book", test3, 40.2, 59);
		
		System.out.println(testBook.toString());
		
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		System.out.println("********************************************************");
		
//		char m = 'm';
//		char f = 'f';
//		char o = 'm';
//		
//		if(m == o || f == o){
//			System.out.println("It is M or F");
//		}else{
//			System.out.println("It is not M or F");
//		}
//		
//		switch(o){
//		case 'm': 
//			System.out.println("It is m");
//			break;
//		case 'f':
//			System.out.println("It is f");
//			break;
//			default:
//				System.out.println("Not in list");
		
				
				
				
		Author test1 = new Author("name", "name@name", 'f');
		Author test2 = new Author("name1", "name1@name1", 'o');
		
		
		System.out.println(test1.toString());
		System.out.println(test2.toString());
		
		
		System.out.println("**************************************");
		char checkChar = 'm';
		boolean testBool = ckeckGender(checkChar);
		System.out.println(testBool);
	}
	
		public static boolean ckeckGender( char gender){
			char m = 'm';
			char f = 'f';
			
			if(m == gender || f == gender){
				return true;
				
			}else{
				return false;
			}
	}	

	}

