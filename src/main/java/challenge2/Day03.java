package challenge2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Day03 extends GenericDay {
	
	@Override
	public void executeChallenge(List<Person> lista) {
		System.out.println("Ordenando em ordem crescente");
		lista.stream()
			.sorted(Comparator.comparing((Person p)->p.getName()))
			.collect(Collectors.toList())
			.forEach(p -> System.out.println(p));
		
		System.out.println("Ordenando em ordem decrescente");
		lista.stream()
			.sorted(Comparator.comparing((Person p)->p.getName()).reversed())
			.collect(Collectors.toList())
			.forEach(p -> System.out.println(p));
	}
}
