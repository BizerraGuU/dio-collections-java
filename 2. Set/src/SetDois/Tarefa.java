package SetDois;

import java.util.Objects;

public class Tarefa {

	private String descricao;
	private boolean conlcuida;

	public Tarefa(String descricao) {
		super();
		this.descricao = descricao;
	}


	@Override
	public int hashCode() {
		return Objects.hash(descricao);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tarefa other = (Tarefa) obj;
		return Objects.equals(descricao, other.descricao);
	}

	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "Tarefa [descricao=" + descricao + "]";
	}


	public boolean isConlcuida() {
		return conlcuida;
	}


	public void setConlcuida(boolean conlcuida) {
		this.conlcuida = conlcuida;
	}
	
	
}
