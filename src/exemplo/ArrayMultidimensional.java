package exemplo;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		int[][] numeros = { { 1, 2, 3, 4 }, { 5, 6, 7 } };
		// Em vetor, primeiro vem a linha e depois a coluna
		int valor = numeros[1][2];
		System.out.println(valor);

	}

}
