package ua.lviv.lgs;

public class Rectangle {
	private int length;
	private int width;
 
	Rectangle () {
		this.length= 5;
		this.width=3;	
}
	Rectangle (int length, int width ) {
		this.length= length;
		this.width=width;
	}
	public void PS () {
		System.out.println("Площа прямокутника = "+ length*width);
		System.out.println("Периметр прямокутника = "+ (length+width)*2);
			}
	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}
	
}
