package entities;

public class Rectangle {
	
	private double width;
	private double height;
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	//
	
	public double getHeight() {
		return height;
	}
	
	public void setHeigth(double height) {
		this.height = height;
	}
	//
	
	public double area() {
		return height * width;
	}
	
	public double perimeter() {
		return ((2 * height) + (2 * width));
	}
	
	public double diagonal() {
		return Math.sqrt(Math.pow(height, 2) + (Math.pow(width, 2) ) );
	}
}
