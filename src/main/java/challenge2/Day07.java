package challenge2;

import java.util.List;
import java.util.stream.Collectors;

public class Day07 extends GenericDay {

	@Override
	public void executeChallenge(List<Person> lista) {
		lista.stream()
			.map(p->Utilities.fromPersonToUser(p))
			.collect(Collectors.toList())
			.forEach(u -> System.out.println(u));
	}
}
