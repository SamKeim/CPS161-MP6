package family;

public class Person {

	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String n, int a) {
		this.name = n;
		this.age = a;
	}
	
	@Override
	public String toString() {
		return name + ", aged " + age;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o == null) return false;
		if(this == o) return true;
		if(getClass() == o.getClass()) {
			Person p = (Person) o;
			return name.equals(p.name) && age == p.age;
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
}
