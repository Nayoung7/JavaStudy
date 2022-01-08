package Question_4¿Â;

class ex05Circle {
	private double x, y;
	private int radius;
	
	public ex05Circle(double x, double y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public void show() {
		System.out.println("("+x+","+y+")"+radius);
	}
}
