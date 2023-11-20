package com.prowings.ObjectsMethods;

public class Employee {
	int empId;
	String name;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String name) {
		super();
		this.empId = empId;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId +","+"name="+name+ "]";
	}

	public boolean equals(Object anotherObject) {
		Employee other = (Employee) anotherObject;
		boolean res = false;
		if (this.empId == other.empId && this.name == other.name)
//(or)  if (this.empId==other.empId && this.name.equals(other.name))
			res = true;

		return res;
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "Ram");
		Employee emp2 = new Employee(20, "Sham");

		System.out.println(emp1 == emp2);

		System.out.println(emp1.equals(emp2));

		int hascodeEmp1 = emp1.hashCode();

		System.out.println(hascodeEmp1);

		int hascodeEmp2 = emp2.hashCode();

		System.out.println(hascodeEmp2);

		System.out.println("==================");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(empId, name);
//	} 

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Employee other = (Employee) obj;
//		return empId == other.empId && Objects.equals(name, other.name);
//	}
}
