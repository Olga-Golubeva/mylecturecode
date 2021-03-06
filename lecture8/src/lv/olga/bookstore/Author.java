package lv.olga.bookstore;

public class Author {
	private String name;
	private String email;
	private char gender;
	
	
	
	
	
	public Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		if(ckeckGender(gender)){
		this.gender = gender;
	}else{
		this.gender = 'x';
	}
	}
	
	public Author(String name){
		this.name = name;
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
	
	
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public char getGender() {
		return gender;
	}

//	@Override
//	public String toString() {
//		return "Author [name=" + name + ", email=" + email + ", gender="
//				+ gender + "]";
//	}
	
	public String toString(){
		return "Name " + this.name;
	}
	

}
