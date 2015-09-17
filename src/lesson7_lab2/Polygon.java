package lesson7_lab2;

public interface Polygon {

	public double[] getSides();

	default double computePerimeter() {
		double perimeter = 0.0;
		for (double side : getSides()) {
			perimeter += side;
		}
		return perimeter;
	}
}
