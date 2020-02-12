package lv.olga.repeatJavaClassOOP;

public class MyClassConstructor {
 
	private long modelYear;
	private String modelName;
	
	public MyClassConstructor(){
		
	}
	
	public MyClassConstructor(long modelYear, String modelName){
		this.modelYear = modelYear;
		this.modelName = modelName;
	}
	public String getModelName(){
		return modelName;
	}

	public long getModelYear() {
		return modelYear;
	}

	
	}
	

