package ua.lviv.lgs;

public class Kolo {
	private double  radius;
	private double  diameter;
	
	Kolo (double  radius, double  diameter ) {
			this.radius= radius;
			this.diameter=diameter;
		}
		public void Kolo_S () {
			System.out.println("Площа кола = "+ Math.PI*Math.pow(diameter,2)/4);}
						
		public void Kolo_L () {
			System.out.println("Довжина кола = "+ 2*Math.PI*radius);}
		
		@Override
		public String toString() {
			return "Kolo [radius=" + radius + ", diameter=" + diameter + "]";
		}
		
	}
