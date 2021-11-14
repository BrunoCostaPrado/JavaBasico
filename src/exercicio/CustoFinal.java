package exercicio;

import java.util.Scanner;

public class CustoFinal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o custo de fabrica: ");
		int c = input.nextInt();
		int cf = c + (28 / 100 * c) + (45 / 100 * c);
		System.out.print("O custo final é: " + cf);
		input.close();
	}
}