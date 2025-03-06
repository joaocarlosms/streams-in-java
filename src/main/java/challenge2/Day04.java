package challenge2;

import java.util.List;
import java.util.stream.Collectors;

public class Day04 extends GenericDay{
	
	@Override
	public void executeChallenge(List<Person> lista) {
		lista.stream()
			.filter(p -> p.getName().contains("Ana ") && p.getidade() >= 30 && p.getidade() <= 35)
			.collect(Collectors.toList())
			.forEach(p -> System.out.println(p));
	}
}
