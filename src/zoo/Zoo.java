package zoo;

public class Zoo {

	private int actualNumAnimals;
	private int numCages;
	private Animal[] animals;
	
	public Zoo() {
		numCages = 3;
		actualNumAnimals = 0;
		animals = new Animal[numCages];
	}
	
	public Zoo(int cages) {
		numCages = cages;
		actualNumAnimals = 0;
		animals = new Animal[numCages];
	}
	
	public void add(Animal a) {
		if(actualNumAnimals < numCages) {
			animals[actualNumAnimals] = a;
			actualNumAnimals++;
		} else {
			System.out.println("Unable to add animal!");
		}
	}
	
	public double totalWeight() {
		double totalWeight = 0.0;
		for(Animal a : animals) {
			totalWeight += a.getWeight();
		}
		return totalWeight;
	}
	
	public void makeAllNoises() {
		for(Animal a : animals) {
			System.out.println(a.makeNoise());
		}
	}
	
	public void printAllAnimals() {
		for(Animal a : animals) {
			System.out.println(a.toString());
		}
	}
}
