package lesson11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lab5 {

	public static <T extends Comparable<T>> T findsecondsmallestelement(List<T> list) {
		T tmp;
		for (int j = 1; j <= 2; j++) {
			System.out.println(j);
			for (int i = 0; i < list.size() - 1; i++) {
				System.out.println("list size is " + list.size());
				System.out.println("value of i " + i);
				if (list.get(i).compareTo(list.get(i + 1)) < 0) {
					tmp = list.get(i + 1);
					list.set(i + 1, list.get(i));
					list.set(i, tmp);
				}
			}

		}
		return list.get(list.size() - 2);

	}

	public static void main(String[] args) {
		List<Integer> ints = new ArrayList<>();
		ints.add(4);
		ints.add(10);
		ints.add(10000);
		ints.add(420000);
		ints.add(-20);
		ints.add(-30);
		System.out.println("the second smallest element is " + findsecondsmallestelement(ints));

	}

}
