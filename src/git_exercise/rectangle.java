package git_exercise;

public class rectangle {
	private double width;
	private double length;
	private double area;
	public rectangle(double width, double length) {
		this.width = width;
		this.length = length;
		area = width*length;
	}
	public double getArea() {
		return area;
	}
}
