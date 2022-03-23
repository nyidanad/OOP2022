package mypersons;

public class Chield extends Person {
	private String school;

	public Chield(String name, int age, String school) {
		super(name, age);
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "Chield [school=" + school + ", getSchool()=" + getSchool() + ", getName()=" + getName() + ", getAge()="
				+ getAge() + "]";
	}



	// GETTER, SETTER
	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	
}
