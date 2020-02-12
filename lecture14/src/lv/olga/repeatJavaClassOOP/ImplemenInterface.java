package lv.olga.repeatJavaClassOOP;

public class ImplemenInterface implements InterfaceClass{

	@Override
	public void sendEmail() {
		System.out.println("email@email.com");

	}

	@Override
	public int sendEmailCount() {
		int i = 0;
		return ++i;
	
		
		
	}

	
}
