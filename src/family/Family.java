package family;

import java.util.ArrayList;
import java.util.List;

public class Family {
	
	private int sizeOfFamily;
	List<Person> family;
	
	public Family(int size) {
		sizeOfFamily = size;
		family = new ArrayList<>();
	}
	
	void addPerson(Person p) {		
		// Check for space
		if(family.size() == sizeOfFamily) {
			System.out.println("Family Array is already full.");
			return;
		}
		// Check if Family is empty
		if(family.size() != 0) {
			// Check for duplicate, exit if found
			for(int i = 0; i < family.size(); i++) {
				if(family.get(i).equals(p)) {
					System.out.println(p.toString() + " is already a member of this family.");
					return;
				}
			}
		}
		// Otherwise, add member;
		family.add(p);
	}
	
	void printOutFamily() {
		for(int i = 0; i < sizeOfFamily; i++) {
			System.out.println(family.get(i).toString());
		}
	}
}
