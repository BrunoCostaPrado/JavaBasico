package exercicio;

import java.util.Scanner;

public class PositivoNegativo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		int i = input.nextInt();
		if (i >= 0) {
			System.out.print("� Positivo");
		} else {
			System.out.print("� Falso");
		}
		input.close();
	}

}
