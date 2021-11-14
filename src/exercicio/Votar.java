package exercicio;

import java.util.Scanner;

public class Votar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = 2021;
		System.out.print("Insira seu ano de nascimento: ");
		int an = input.nextInt();
		int v = a - an;
		if (v >= 18) {
			System.out.print("Pode votar.");
		} else {
			System.out.print("Não pode votar.");
		}
		input.close();
	}
}
