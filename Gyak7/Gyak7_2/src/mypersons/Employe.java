package mypersons;

public class Employe extends Adult{
	private int salary;
	private static int retire = 65;
	
	public Employe(String name, int age, String workplace, int salary) {
		super(name, age, workplace);
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employe [getName()=" + getName() + ", getWorkplace()=" + getWorkplace() + ", getAge()=" + getAge() + ", salary=" + salary + "]";
	}


	// GETTER, SETTER
	public int getSalary() {
		return salary;
	}
	
}
