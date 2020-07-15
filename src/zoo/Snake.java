package zoo;

public class Snake extends Animal {

	private int numFangs;
	
	public Snake() {
		
	}
	
	public Snake(String name, double weight, int age, int numFangs) {
		super(name, weight, age);
		this.numFangs = numFangs;
	}
	
	public String makeNoise() {
		return "Hisssssss";
	}
	
	@Override
	public String toString() {
		return String.format("%s, number of fangs: %d", super.toString(), numFangs);
	}
}
