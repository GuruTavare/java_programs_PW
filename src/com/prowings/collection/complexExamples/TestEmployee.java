package com.prowings.collection.complexExamples;

import java.util.*;

public class TestEmployee {

	public static void main(String[] args) {
		Employee e1 = new Employee(10, "Ram", 30000.0, "pune");
		Employee e2 = new Employee(20, "Sham", 10000.0, "kol");
		Employee e3 = new Employee(30, "Raju", 20000.0, "del");
		Employee e4 = new Employee(30, "Ramu", 70000.0, "sangali");
		Employee e5 = new Employee(30, "jiju", 80000.0, "bhandara");

		List<Employee> l = new ArrayList<>();
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);

		// Collections.sort(l);
//		System.out.println(l);

		// Employee emp = findSecondHighestSalary(l);
		findSecondHighestSalary(l);

		// System.out.println("Employee name:"+emp.getName()+" salary"+emp.getSalary());

	}

	public static void findSecondHighestSalary(List<Employee> l) {
		Map<Double, Employee> m = new TreeMap<>(Collections.reverseOrder());

		for (Employee emp : l) {
			m.put(emp.getSalary(), emp);
		}

		// System.out.println(m);

		Iterator<Map.Entry<Double, Employee>> itr1 = m.entrySet().iterator();
		while (itr1.hasNext()) {
			System.out.println(itr1.next().getValue());
		}

//		Iterator itr = (m.keySet()).iterator();
//		itr.next();
//		Object o =null;
//		if (itr.hasNext())
//			 o =itr.next();
//			System.out.println("Employee details are:" + m.get(o));
//			System.out.println("Employee second highest salary: " + o );
//			
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<");
		Iterator<Map.Entry<Double, Employee>> itr2 = m.entrySet().iterator();
		itr2.next();
		if (itr2.hasNext()) {
			Map.Entry<Double, Employee> x = itr2.next();

			System.out.println("Second Highest Salary is : " + x.getKey() + "\nEmployee name: " + x.getValue().getName()
					+ "\nEmployee id: " + x.getValue().getId() + "\nEmployee Address:" + x.getValue().getAddress());

		}
		
	}
	

}