package exercicio;

import java.util.Scanner;

public class LerValor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2;
		System.out.print("Insira o numero:");
		n1 = input.nextInt();
		System.out.print("Insira o numero:");
		n2 = input.nextInt();
		if (n1 == n2) {
			System.out.print("Numeros iguais");
		} else if (n1 > n2) {
			System.out.print("O primeiro valor é maior");
		} else {
			System.out.print("O segundo valor é maior: ");
		}

	}
}
