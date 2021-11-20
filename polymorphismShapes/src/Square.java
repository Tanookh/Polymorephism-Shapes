public class Square extends Shape implements Printable{
	
	private double width;
	private double height;
	public Square(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	@Override
	public double area() {
		return this.width * this.height;
	}

	@Override
	public double diameter() {
		return this.height * 2 + this.width*2;
	}

	@Override
	public void print() {
		System.out.println("Printing " + this.getClass().getName() + " with width "+ width + " and height " + height);
	}
}