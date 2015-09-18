package lesson7_lab2;

public class EquilateralTriangle implements ClosedCurve {

	double length = 0.0;

	public EquilateralTriangle(double l) {
		length = l;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	@Override
	public double[] getSides() {
		return new double[] { length, length, length };
	}

}
