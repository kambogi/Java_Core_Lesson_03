package ua.lviv.lgs;

public class Kolo {
	private double  radius;
	private double  diameter;
	
	Kolo (double  radius, double  diameter ) {
			this.radius= radius;
			this.diameter=diameter;
		}
		public void Kolo_S () {
			System.out.println("����� ���� = "+ Math.PI*Math.pow(diameter,2)/4);}
						
		public void Kolo_L () {
			System.out.println("������� ���� = "+ 2*Math.PI*radius);}
		
		@Override
		public String toString() {
			return "Kolo [radius=" + radius + ", diameter=" + diameter + "]";
		}
		
	}
