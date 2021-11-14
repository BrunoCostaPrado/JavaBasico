package exercicio;

import java.util.Scanner;

public class Crescente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		float a = input.nextFloat();
		System.out.print("Insira um numero: ");
		float b = input.nextFloat();
		if (a > b) {
			System.out.print(" é maior que " + b);
		} else if (a == b) {
			System.out.print("Os numeros são iguais");
		} else {
			System.out.print(b + " é maior que " + a);
		}
		input.close();
	}

}
