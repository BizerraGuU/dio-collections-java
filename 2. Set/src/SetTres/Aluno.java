package SetTres;

import java.util.Comparator;

public class Aluno implements Comparable<Aluno> {

	private String nome;
	private long matricula;
	private double nota;
	
	public Aluno(String nome, long matricula, double nota) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.nota = nota;
	}

	public String getNome() {
		return nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public double getNota() {
		return nota;
	}

	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + ", nota=" + nota + "]";
	}

	
	public int compareTo(Aluno a) {
        return nome.compareToIgnoreCase(a.getNome());
    }	
}

class ComparatorPorNota implements Comparator<Aluno>{

	@Override
	public int compare(Aluno aUm, Aluno aDois) {
		
		return Double.compare(aUm.getNota(), aDois.getNota());
	}
	
}
