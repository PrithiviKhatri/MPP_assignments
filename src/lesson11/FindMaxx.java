package lesson11;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;



public class FindMaxx {

public static void main(String[] args) {
//	List<Integer>  integers=new ArrayList<Integer>();
//	for (int i=1;i<=15;i++){
//		integers.add(i);
//	}
//System.out.println("max value is "+max(integers));

List<LocalDate> dates=new ArrayList<LocalDate>();
dates.add(LocalDate.of(2011, 1, 1));
dates.add(LocalDate.of(2014, 2, 5));
LocalDate mostRecent=max(dates);
System.out.println("the most recent date "+mostRecent);
}
	
	public static<T extends Comparable<? super T>> T max(List<T> list) {
		T max = list.get(0);
		for (T i : list) {
			if (i.compareTo(max) > 0)
				max = i;
		}

		return max;

	}

}
