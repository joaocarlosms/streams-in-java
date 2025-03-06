package challenge2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day05 extends GenericDay {
	
	@Override
	public void executeChallenge(List<Person> lista) {
		lista.stream()
			.filter(p -> p.getName().startsWith("Ana "))
			.sorted(Comparator.comparing(Person::getidade))
			.collect(Collectors.toList())
			.forEach(p->System.out.println(p));
	}
}
