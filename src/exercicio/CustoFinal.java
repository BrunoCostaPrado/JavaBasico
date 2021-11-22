package exercicio;

import java.util.Scanner;

public class CustoFinal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o custo de fabrica: ");
		int c = input.nextInt();
		int p = 100 * c;
		int cf = (c + (28 / p) + (45 / p));
		System.out.print("O custo final é: " + cf);
		input.close();
	}
}