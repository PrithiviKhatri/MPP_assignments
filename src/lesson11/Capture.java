package lesson11;

import java.util.ArrayList;
import java.util.List;

public class Capture {

	public static void reverse(List<?> list) {
		helperreverse(list);
	}

	static <T> void helperreverse(List<T> list) {
		List<T> reverse = new ArrayList<>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reverse.add(list.get(i));
		}
		System.out.println("Reverselist is " + reverse);
	}

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("A");
		names.add("B");
		names.add("cat");
		reverse(names);
	}

}
