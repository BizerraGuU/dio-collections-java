package pesquisa;

import java.util.ArrayList;
import java.util.List;

import list.Numeros;

public class SomaNumeros {

	public List<Numeros> listaDeNumeros;
	
	public SomaNumeros() {
		this.listaDeNumeros = new ArrayList<>();
	}
	
	public void adicionarNumero(int numero) {
		listaDeNumeros.add(new Numeros(numero));
	}
	
	public int calcularSoma() {
		
		int somaDosNumeros = 0;
		
		for (Numeros lisNumeros : listaDeNumeros) {
			somaDosNumeros += lisNumeros.getNumero();
		}
		return somaDosNumeros;
	}
	
	public int econtraMaiorNumero() {
	
		int maiorNumero = 0;
		
		for (Numeros nMaiorNumeros : listaDeNumeros) {
			if (nMaiorNumeros.getNumero() > maiorNumero) {
				maiorNumero = nMaiorNumeros.getNumero();
			}
		}
		
		System.out.println("o maior numero é: " + maiorNumero);
		
		return maiorNumero;
	}
	
	public int encontrarMenorNumero() {
		
		int menorNumero = 0;
		
		for (Numeros nMaiorNumeros : listaDeNumeros) {
			if (nMaiorNumeros.getNumero() < menorNumero) {
				menorNumero = nMaiorNumeros.getNumero();
			}
		}
		
		System.out.println("o maior numero é: " + menorNumero);
		
		return menorNumero;
	}
	
	public void exibirNumeros() {
		for (Numeros numeros : listaDeNumeros) {
			System.out.println("numeros: " + numeros.getNumero());
		}
	}
}

