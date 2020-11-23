package ua.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		Rectangle a1 = new Rectangle();
		Rectangle a2 = new Rectangle(3,8);
		System.out.println(a1);
		a1.PS();
		System.out.println(a2);
		a2.PS();
		
		Kolo k1 = new Kolo (4,8);
		System.out.println(k1);
		k1.Kolo_S();
		k1.Kolo_L();
	}

}
