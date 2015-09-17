package lesson8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import lesson7_lab1_partB.Employee;

public class EmployeeInfo {
	static enum SortMethod {
		BYNAME, BYSALARY
	};

	SortMethod method;

	public EmployeeInfo(SortMethod method) {
		this.method = method;
	}

	// The Comparators are unaware of the choice of sort method
	public void sort(List<Employee> emps) {
	//LamdaExpression
//		Comparator<Employee> byname = (e1, e2) -> e1.getName().compareTo(e2.getName());
//		Comparator<Employee> bysalary = (e1, e2) -> e1.getSalary() > e2
//				.getSalary() ? 1 : -1;
//		if (method == SortMethod.BYNAME) {
//			Collections.sort(emps, byname);
//		} else if (method == SortMethod.BYSALARY) {
//			Collections.sort(emps,  bysalary);
//		}
	
	Comparator<Employee> comp=(e1,e2)->{
		if(method == SortMethod.BYNAME) {
			return e1.getName().compareTo(e2.getName());
			} else {
			if(e1.getSalary() == e2.getSalary()) return 0;
			else if(e1.getSalary() < e2.getSalary()) return -1;
			else return 1;
			} };
	
		    Collections.sort(emps,comp);
	
	}

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Joe", 100000));
		emps.add(new Employee("Tim", 50000));
		emps.add(new Employee("Andy", 60000));
		EmployeeInfo ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYNAME);
		ei.sort(emps);
		System.out.println(emps);
		ei = new EmployeeInfo(EmployeeInfo.SortMethod.BYSALARY);
		ei.sort(emps);
		System.out.println(emps);
	}
}