package ordenacao;

public class Main {

	public static void main(String[] args) {

		OrdenacaoNumeros ordenar = new OrdenacaoNumeros();
		
		ordenar.adicionaNumero(5);
		ordenar.adicionaNumero(10);
		ordenar.adicionaNumero(28);
		ordenar.adicionaNumero(19);
		
		System.out.println("Imprimindo em ordem Ascendente: " + ordenar.ordenarAscendente());
		System.out.println("Imprimindo em ordem Descendente: " + ordenar.ordenarDescendente());
	}
}
