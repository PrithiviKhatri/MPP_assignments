package lesson7_lab2;

public class Ellipse implements ClosedCurve{
	double semimajoraxis;
	double eccentricity;

	
	
	public Ellipse(double semimajoraxis, double eccentricity) {
		super();
		this.semimajoraxis = semimajoraxis;
		this.eccentricity = eccentricity;
	}

	public double getSemimajoraxis() {
		return semimajoraxis;
	}

	public void setSemimajoraxis(double semimajoraxis) {
		this.semimajoraxis = semimajoraxis;
	}

	public double getEccentricity() {
		return eccentricity;
	}

	public void setEccentricity(double eccentricity) {
		this.eccentricity = eccentricity;
	}

	@Override
	public double computePerimeter() {
		return 4 * semimajoraxis * eccentricity;
	}

}
