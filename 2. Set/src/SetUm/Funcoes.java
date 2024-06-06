package SetUm;

import java.util.HashSet;
import java.util.Set;

public class Funcoes {
	
	private Set<ConjuntoPalavrasUnicas> conjuntoDePalavraSet;
	
	public Funcoes() {
		super();
		this.conjuntoDePalavraSet = new HashSet<>();
	}

	public void adicionarPalavra(String palavra) {
		
		conjuntoDePalavraSet.add(new ConjuntoPalavrasUnicas(palavra));
	}
	
	public void removerPalavra(String palavra) {
		
		for (ConjuntoPalavrasUnicas c : conjuntoDePalavraSet) {	
			
			if (c.getPalavra().equalsIgnoreCase(palavra)) {
				conjuntoDePalavraSet.remove(palavra);
			} else {
				System.out.println("Esta palavra não existe na lista.");
			}
		}
	}
	
	public void verificarPalavra(String palavra) {
		
		for (ConjuntoPalavrasUnicas c : conjuntoDePalavraSet) {	
			
			if (c.getPalavra().equalsIgnoreCase(palavra)) {
				System.out.printf("A palavra %s foi encontrada", palavra);;
			} else {
				System.out.println("Esta palavra não existe na lista.");
			}
		}
	}
	
	public void exibirPalavrasUnicas() {

		if (conjuntoDePalavraSet.isEmpty()) {
			System.out.println("A lista está vazia");
			
		} else {
			
			for (ConjuntoPalavrasUnicas c : conjuntoDePalavraSet) {
				System.out.println(c);
			}
		}
	}
}




