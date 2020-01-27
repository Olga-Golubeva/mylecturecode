package lv.olga.figure;

public class Rectangle {
	private float length;
	private float width;
	
	
	public Rectangle(){
		this.length = 12.0f;
		this.width = 14.0f;
	}


	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
	}

	
	public Rectangle(float width) {
		this.length = 2.4f;
		this.width = width;
	}

	public float getLength() {
		return length;
	}


	public void setLength(float length) {
		this.length = length;
	}


	public float getWidth() {
		return width;
	}


	public void setWidth(float width) {
		this.width = width;
	}

	public String toString(){
		return "Length: " + this.length+" Width: "+ this.width;
	
}
	
	
}
