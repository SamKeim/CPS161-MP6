package zoo;

public class Application {
	public static void main(String[] args) {
		Zoo z = new Zoo();
		Snake sly = new Snake("Sly", 5.0, 2, 2);
		Snake sly2 = new Snake("Slyme", 10.0, 1, 2);
		Cow blossy = new Cow("Blossy", 900., 5, 10);
		Horse prince = new Horse("Prince", 1000., 5, 23.2);
		// Following not allowed because Animal is abstract
		// Animal spot = new Animal("Spot", 10., 4);
		z.add(sly);
		z.add(sly2);
		z.add(blossy);
		z.add(prince);
		z.makeAllNoises();
		System.out.println("Total weight =" + z.totalWeight());
		System.out.println("**************************");
		System.out.println("Animal Printout:");
		z.printAllAnimals();
		System.out.println("********* Now we will make the Second Zoo");
		Zoo z2 = new Zoo(5);
		z2.add(sly);
		z2.add(sly2);
		z2.add(blossy);
		z2.add(prince);
		z2.add(new Horse("Warrior", 1200, 6, 25.3));
		z2.add(new Horse("Harry", 1100, 4, 21.3));
		System.out.println("Total weight of z2=" + z2.totalWeight());
		z2.makeAllNoises();
		z2.printAllAnimals();
	}
}
