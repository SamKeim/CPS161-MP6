package zoo;

public class Horse extends Animal {

	private double topSpeed;
	
	public Horse() {
		
	}
	
	public Horse(String name, double weight, int age, double topSpeed) {
		super(name, weight, age);
		this.topSpeed = topSpeed;
	}
	
	public String makeNoise() {
		return "Whinny";
	}
	
	@Override
	public String toString() {
		return String.format("%s, top speed: %.2f", super.toString(), topSpeed);
	}
	
}
