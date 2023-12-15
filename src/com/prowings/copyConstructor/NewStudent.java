package com.prowings.copyConstructor;

public class NewStudent {
	// fields do contain any mutable field
	private int id;
	private String name;
	private Address address;

	public NewStudent(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	//copy constructor---deep copy
	public NewStudent(NewStudent x) {
		this.id = x.getId();
		this.name = x.getName();
		//this.address = x.getAddress();
		
		Address copyAdd = new Address();
		copyAdd.setPin(x.getAddress().getPin());
		copyAdd.setCity(x.getAddress().getCity());
		copyAdd.setCountry(x.getAddress().getCountry());
		this.address =copyAdd;
		
	}

	public NewStudent() {
		super();
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public Address getAddress() {
		return address;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "NewStudent [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

	

}
