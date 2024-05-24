package ordenacao;

public class Numeros implements Comparable<Numeros>{
	
	private int numeros;
	
	public int compareTo(Numeros n) {
		return Integer.compare(numeros, n.getNumeros());
	}

	public Numeros(int numeros) {
		this.numeros = numeros;
	}

	public int getNumeros() {
		return numeros;
	}
	
	public String toString() {
		// TODO Auto-generated method stub
		return String.valueOf(numeros);
	}
}
