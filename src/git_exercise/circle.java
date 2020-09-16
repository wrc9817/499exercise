package git_exercise;

public class circle{
	private double radius;
	private double area;
	public circle(double radius) {
		this.radius = radius;
		this.area = radius*radius*3.14;
	}
	public double getArea() {
		return area;
	}
}
