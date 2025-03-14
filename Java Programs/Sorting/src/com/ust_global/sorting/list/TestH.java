package com.ust_global.sorting.list;

import java.util.Iterator;
import java.util.TreeSet;

public class TestH {
	public static void main(String[] args) {

		TreeSet<Employee> hs = new TreeSet<>();
		Employee e1 = new Employee(12, "Sweety", 40000);
		Employee e2 = new Employee(99, "Vini", 90000);
		Employee e3 = new Employee(5, "Momo", 20000);
		Employee e4 = new Employee(34, "Seenu", 60000);
		Employee e5 = new Employee(34, "Seenu", 60000);

		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		hs.add(e4);		
		hs.add(e5);

		System.out.println("~~~ Using iterator ~~~");
		Iterator<Employee> it = hs.iterator();
		while(it.hasNext())
		{
			Employee e = it.next();
			System.out.println("Id is : "+e.id);
			System.out.println("Name is : "+e.name);
			System.out.println("Salary is : "+e.salary);
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~");

		}
	}
}
