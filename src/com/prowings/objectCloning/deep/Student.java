package com.prowings.objectCloning.deep;

public class Student implements Cloneable {

	private int id;
	private String name;
	Car car;

	public Student(int id, String name, Car car) {
		super();
		this.id = id;
		this.name = name;
		this.car = car;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Car getCar() {
		return car;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", car=" + car + "]";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {

		Student clonedStudent = (Student) super.clone();

		Car clonedCar = (Car) this.car.clone();

		clonedStudent.setCar(clonedCar);

		return clonedStudent;

	}

}
