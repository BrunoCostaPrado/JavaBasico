package exemplo;

public class Array6 {

	public static void main(String[] args) {
		int[][] numeros = { { 1, 2, 3, 4, 5, 6 }, { 7, 8, 9, 5, 3 } };
		for (int i = 0; i < numeros.length; i++) {
			for (int j = 0; j < numeros[i].length; j++) {
				System.out.println(numeros[i][j]);
			}
		}

	}

}
