package git_exercise;

public class Test {
	public static void main(String[]args) {
		// test whether the area calculations are correct 
		//by comparing circles and rectangles' Area.
		circle c = new circle(2);
		// c's area is 2*2*pi
		rectangle r = new rectangle(4, 3.14);
		//r's area is 4*pi
		rectangle r1 = new rectangle(4, 5);
		//r1's area is 4*5
		if(c.getArea()==r.getArea()) {
			System.out.print("Equal\r");
		}else {
			System.out.print("Not equal\r");
		}
		if(r.getArea()==r1.getArea()) {
			System.out.print("Equal");
		}else {
			System.out.print("Not equal");
		}
	}
	// yeah yeah yeah!
}