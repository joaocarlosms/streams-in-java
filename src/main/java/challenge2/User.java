package challenge2;

public record User(Integer id, String email) {
	
	public User fromPersonToUser(Person person) {
		return new User(person.getId(), person.getEmail());
	}
}
