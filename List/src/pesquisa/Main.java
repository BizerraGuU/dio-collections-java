package pesquisa;

public class Main {

	public static void main(String[] args) {

		SomaNumeros novaSoma = new SomaNumeros();

		novaSoma.adicionarNumero(50);
		novaSoma.adicionarNumero(2);
		novaSoma.adicionarNumero(27);
		novaSoma.adicionarNumero(100);
		
		novaSoma.econtraMaiorNumero();
		novaSoma.encontrarMenorNumero();
		
		novaSoma.exibirNumeros();
	}
}
