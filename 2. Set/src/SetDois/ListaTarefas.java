package SetDois;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
	
	private Set<Tarefa> listaDeTarefas;

	public ListaTarefas() {
		super();
		this.listaDeTarefas = new HashSet<>();
	}
	
	public void adicionarTarefa(String descricao) {
		listaDeTarefas.add(new Tarefa(descricao));
	}
	
	public void removerTarefa(String descricao) {
		if (listaDeTarefas.isEmpty()) {
			System.out.println("A lista está vazia");
		} else {
			for (Tarefa t : listaDeTarefas) {
				if (t.getDescricao().equalsIgnoreCase(descricao)) {
					listaDeTarefas.remove(t);
					break;
				}
			}
		}
	}
	
	public void exibirTarefas() {
		for (Tarefa t : listaDeTarefas) {
			System.out.println(t);
		}
	}
	
	public void contarTarefas() {
		int cont = 0;
		
		for (Tarefa t : listaDeTarefas) {
			cont++;
		}
		
		System.out.println("o número total de tarefas é: " + cont);
	}
	
	public void marcarTarefaConcluida(String descricao) {
		for (Tarefa t : listaDeTarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConlcuida(true);
				return;
			}
		}
	}
	
	public void marcarTarefaPendente(String descricao) {
		for (Tarefa t : listaDeTarefas) {
			if (t.getDescricao().equalsIgnoreCase(descricao)) {
				t.setConlcuida(false);
				return;
			}
		}
	}
	
	public Set<Tarefa> obterTarefasConcluidas(){
		
		Set<Tarefa> tarefasConluida = new HashSet<>();
		
		for (Tarefa t : listaDeTarefas) {
			if (t.isConlcuida()) {
				tarefasConluida.add(t);
			}
		}
		
		return tarefasConluida;
	}
	
	public Set<Tarefa> obterTarefasPendentes(){
		
		Set<Tarefa> tarefasPendentes = new HashSet<>();
		
		for (Tarefa t : listaDeTarefas) {
			if (t.isConlcuida()) {
				tarefasPendentes.add(t);
			}
		}
		
		return tarefasPendentes;
	}
	
	public void limparListaTarefas() {
		listaDeTarefas.removeAll(listaDeTarefas);
	}
}
