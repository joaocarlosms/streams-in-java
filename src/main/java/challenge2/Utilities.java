package challenge2;

public class Utilities {
	
	public static User fromPersonToUser(Person person) {
		return new User(person.getId(), person.getEmail());
	}
}
