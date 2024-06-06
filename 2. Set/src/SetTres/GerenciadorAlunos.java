package SetTres;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {

	private Set<Aluno> listaDeAlunos;

	public GerenciadorAlunos() {
		super();
		this.listaDeAlunos = new HashSet<>();
	}
	
	public void adicionarAluno(String nome, long matricula, double media) {
		listaDeAlunos.add(new Aluno(nome, matricula, media));
	}
	
	public void removerAluno(long matricula) {
		Aluno alunoParaRemover = null;
		
		for (Aluno a : listaDeAlunos) {
			if (a.getMatricula() == matricula) {
				alunoParaRemover = a;
				break;
			}
		}
	}
	
	public Set<Aluno> exibirAlunosPorNome(){
		
		Set<Aluno> alunosPorNome = new TreeSet<>(listaDeAlunos);
		
		return alunosPorNome;
	}
	
	public Set<Aluno> exibirAlunosPorNota() {
		Set<Aluno> exibirAlunosPorNota =  new TreeSet<>(new ComparatorPorNota());
		exibirAlunosPorNota.addAll(listaDeAlunos);
		return exibirAlunosPorNota;
	}
}
