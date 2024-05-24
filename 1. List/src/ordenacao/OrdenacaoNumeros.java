package ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
	
	public List<Numeros> numerosList;
	
	public OrdenacaoNumeros() {
		this.numerosList = new ArrayList<>();
	}
	
	public void adicionaNumero(int numero) {
		numerosList.add(new Numeros(numero));
	}
	
	public List<Numeros> ordenarAscendente() {
		List<Numeros> ordemAscendente =  new ArrayList<Numeros>(numerosList);
		Collections.sort(ordemAscendente);
		return ordemAscendente;
	}
	
	public List<Numeros> ordenarDescendente(){
		List<Numeros> ordemDescendente =  new ArrayList<Numeros>(numerosList);
		Collections.sort(ordemDescendente, Collections.reverseOrder());
		return ordemDescendente;
	}
}
