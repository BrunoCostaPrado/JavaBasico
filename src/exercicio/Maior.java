package exercicio;

import java.util.Scanner;

public class Maior {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		float a = input.nextFloat();
		System.out.print("Insira um numero: ");
		float b = input.nextFloat();
		if (a > b) {
			System.out.print("O maior �: " + a);
		} else if (a == b) {
			System.out.print("Os numeros s�o iguais");
		} else {
			System.out.print("O maior �: " + b);
		}
		input.close();
	}
}
