package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Lab1 {

	public static void main(String[] args) {

		List<Integer> ints = new ArrayList<>();
		ints.add(1);
		ints.add(2);

		// a.>First fragment

		// List<Number> nums=ints;
		// Compliler error occurs above because List<Number> is not covariant to
		// List<Integer>.
		// nums.add(3.14);

		// b.>Second fragment

		List<? extends Number> nums = ints;
		// nums.add(3.14);
		// compiler error occurs above because now nums become read only.
		// We cannot add any type except null to it .Compiler does this to
		// prevent adding other subclass of number like float,double as we
		// cannot
		// make sure that user adds only integer as it now points
	}

}
