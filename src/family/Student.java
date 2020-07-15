package family;

public class Student extends Person {
	private String major;
	private double gpa;
	
	public Student() {
		
	}
	public Student(String name, int age, String major, double gpa) {
		super(name, age);
		this.major = major;
		this.gpa = gpa;
	}
	
	@Override
	public String toString() {
		return String.format("%s, Major: %s, GPA: %.1f", super.toString(), major, gpa);
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this == o) return true;
		if(getClass() == o.getClass()) {
			Student s = (Student) o;
			return super.getName().equals(s.getName()) &&
					super.getAge() == s.getAge() &&
					major.equals(s.major) &&
					(Math.abs(gpa - s.gpa) < 0.01);
		}
		return false;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	
	
}
