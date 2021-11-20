public class Program {

	public static void main(String[] args) {
		
		
		Shape[] building = new Shape[3];
		building[0] = new Circle(5);
		building[1] = new Square(10, 10);
		building[2] = new Circle(4);
		
		double sum = calculateArea(building);
		
		System.out.println("Total area is: "+sum);
		Printable newCircle = new Circle(7);
		Printable newSquare = new Square(10, 10);
		newCircle.print();
		newSquare.print();
	}
	
	public static double calculateArea(Shape[] building)
	{
		
		double sum = 0;
		for(Shape shape : building)
		{
			sum += shape.area();
		}
		
		return sum;
	}

}