package list;

public class Main {
	
	public static void main(String[] args) {
		CarrionhoDeCompras novoCarrinho = new CarrionhoDeCompras();
		
		novoCarrinho.adicionarItem("LP Violeta", 190.00, 2);
		novoCarrinho.adicionarItem("LP Gêmeos", 163.00, 5);
		novoCarrinho.adicionarItem("LP B-Side Gêmeos", 165.00, 3);
		
		
		novoCarrinho.exibirItens();
		System.out.println("valor total: R$ " + novoCarrinho.calcularValorTotal() + "0");
		
		novoCarrinho.removerItem("LP B-Side Gêmeos");
		novoCarrinho.exibirItens();
		System.out.println("valor total: R$ " + novoCarrinho.calcularValorTotal() + "0");
	}
}
