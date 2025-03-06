package challenge2;

import java.util.List;

public class Day06 extends GenericDay {
	
	@Override
	public void executeChallenge(List<Person> lista) {
		int maxAge = lista.stream().mapToInt(p->p.getidade()).max().getAsInt();
		int minAge = lista.stream().mapToInt(p->p.getidade()).min().getAsInt();
		int sumAge = lista.stream().mapToInt(p->p.getidade()).sum();
		double avarageAge = lista.stream().mapToInt(p->p.getidade()).average().getAsDouble();
		
		System.out.println("Maior Idade: "+ maxAge);
		System.out.println("Menor Idade:"+ minAge);
		System.out.println("Soma de Idades: "+ sumAge);
		System.out.printf("Média das Idades: %.2f %n", (avarageAge));
	}
}
