package zoo;

public abstract class Animal {
	private String name;
	private double weight;
	private int age;
	
	public Animal() {
		
	}
	
	public Animal(String n, double weight, int age) {
		name = n;
		this.weight = weight;
		this.age = age;
	}
	
	public abstract String makeNoise();

	public double getWeight() {
		return weight;
	}
	
	@Override
	public String toString() {
		return String.format("%s, weight: %,.1f, aged: %d", name, weight, age);
	}

}
