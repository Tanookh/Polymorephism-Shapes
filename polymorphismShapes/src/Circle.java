public class Circle extends Shape implements Printable{
	
	private float radius;

	public Circle(float radius) {
		super();
		this.radius = radius;
	}
	
	
	@Override
	public double area() {
		return Math.PI * this.radius * this.radius ;
	}
	
	@Override
	public double diameter() {
		return 2 * Math.PI * this.radius;
	}


	@Override
	public void print() {
		System.out.println("Printing " + this.getClass().getName() + " with radius "+ radius);
	}

}