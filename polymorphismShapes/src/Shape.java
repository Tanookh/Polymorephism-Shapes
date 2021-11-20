public abstract class Shape {
	
	
	private String color;
	
	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	public abstract double diameter();
	
	public abstract double area();

}