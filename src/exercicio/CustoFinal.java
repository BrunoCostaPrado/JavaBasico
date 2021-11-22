package exercicio;

import java.util.Scanner;

public class CustoFinal {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o custo de fabrica: ");
		float c = input.nextFloat();
		float p = c * 100;
		float cf = ((c * (28 / p)) + (c * (45 / p)) + c);
		System.out.print("O custo final é: " + cf);
		input.close();
	}
}