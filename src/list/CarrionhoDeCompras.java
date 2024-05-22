package list;

import java.util.ArrayList;
import java.util.List;

public class CarrionhoDeCompras {
	
	private List<Item> carrinhoList;
	
	public CarrionhoDeCompras() {
		this.carrinhoList = new ArrayList<>();
	} 
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		carrinhoList.add(new Item(nome, preco, quantidade));
	}
	
	public void removerItem(String nome) {
		List<Item> itensParaRemover = new ArrayList<>();
		
		for (Item cdc : carrinhoList) {
		
		if (cdc.getNome().equalsIgnoreCase(nome)) {
			itensParaRemover.add(cdc);
			}
		}
		
		carrinhoList.removeAll(itensParaRemover);
	}

	public double calcularValorTotal() {
		
		double valorTotal = 0.0;
		
		for (Item itensDoCarrinho : carrinhoList) {
			valorTotal += itensDoCarrinho.getPreco() * itensDoCarrinho.getQuantidade();
		}
		return valorTotal;
	}
	
	public void exibirItens() {
		
		System.out.println("Itens no carrinho: ");
		for (Item itensDoCarrinoItem : carrinhoList) {
			System.out.printf("%s - Preço: R$ %.2f - Quantidade: %d%n", itensDoCarrinoItem.getNome(), itensDoCarrinoItem.getPreco(), itensDoCarrinoItem.getQuantidade());
		}
	}
}
