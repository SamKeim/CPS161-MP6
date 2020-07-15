package zoo;

public class Cow extends Animal {
	private int numSpots;
	
	public Cow() {
		
	}
	
	public Cow(String name, double weight, int age, int numSpots) {
		super(name, weight, age);
		this.numSpots = numSpots;
	}
	
	public String makeNoise() {
		return "Moooo";
	}
	
	@Override
	public String toString() {
		return String.format("%s, spots: %d", super.toString(), numSpots);
	}
}
