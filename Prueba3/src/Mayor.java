
public class Mayor {

	public static int mayor(int[] lista) {
		int indice, max = Integer.MIN_VALUE;

		if (lista.length == 0) {
			throw new RuntimeException("Lista Vacia");
		}

		for (indice = 0; indice < lista.length; indice++) {
			if (lista[indice] > max) {
				max = lista[indice];
			}
		}
		return max;
	}
}
