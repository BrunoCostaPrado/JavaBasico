package exercicio;

import java.util.Scanner;

public class Xadrez {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira a hora do começo: ");
		int a = input.nextInt();
		System.out.print("Insira a hora do fim: ");
		int b = input.nextInt();
		int c = b - a;
		if (c > 0) {
			System.out.print("O jogo durou " + c + " horas");
		} else {
			int d = c + 24;
			System.out.print("O jogo durou " + d + " horas");
		}
		input.close();
	}
}
