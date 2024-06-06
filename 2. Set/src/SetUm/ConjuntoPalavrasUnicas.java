package SetUm;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
	
	private String palavra;

	public ConjuntoPalavrasUnicas(String palavra) {
		super();
		this.palavra = palavra;
	}

	public String getPalavra() {
		return palavra;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(palavra);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConjuntoPalavrasUnicas other = (ConjuntoPalavrasUnicas) obj;
		return Objects.equals(palavra, other.palavra);
	}

	@Override
	public String toString() {
		return "ConjuntoPalavrasUnicas [palavra=" + palavra + "]";
	}
	
	

}


