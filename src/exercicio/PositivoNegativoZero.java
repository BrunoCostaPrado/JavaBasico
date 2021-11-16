package exercicio;

import java.util.Scanner;

public class PositivoNegativoZero {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o numero: ");
		int n = input.nextInt();
		if (n == 0) {
			System.out.print("Igual a zero");
		} else if (n > 0) {
			System.out.print("Positivo");
		} else {
			System.out.print("Negativo");
		}
		input.close();
	}
}
