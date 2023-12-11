package com.prowings.objectCloning;

/**
 * for object cloning of a class it should implements Cloneable.if not then it
 * will give CloneNotSupportedException
 * 
 */
public class ObjectCloning implements Cloneable {

	// let say we have student object

	private int id;
	String name;

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ObjectCloning(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "ObjectCloning [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		ObjectCloning obj = new ObjectCloning(10, "Ram");
		// as clone() returns Object....hence we have to down cast it into ObjectCloning
		// which is child of Object.
		// also clone() throws CloneNotSupportedException which is checked exception,
		// hence we have to handle it.
		ObjectCloning obj2 = null;
		try {
			obj2 = (ObjectCloning) obj.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		System.out.println("Before changing ");
		System.out.println(obj);
		System.out.println(obj2);
		
		System.out.println("After changing ");
		obj.setName("Sham");
		System.out.println(obj);
		System.out.println(obj2);
		
	}
}
