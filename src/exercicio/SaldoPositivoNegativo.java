package exercicio;

import java.util.Scanner;

public class SaldoPositivoNegativo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira sua conta:");
		int c = input.nextInt();
		System.out.print("Insira seu saldo:");
		int s = input.nextInt();
		System.out.print("Insira seu debito:");
		int d = input.nextInt();
		System.out.print("Insira seu credito:");
		int cc = input.nextInt();
		int sa = s - d + cc;
		if (sa >= 0) {
			System.out.print("Seu saldo é positivo: R$" + sa + " conta nº:2: " + c);
		} else {
			System.out.print("Seu saldo é negativo: R$" + sa + " conta nº:2" + c);
		}
		input.close();
	}
}
