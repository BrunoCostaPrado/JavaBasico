package exercicio;

import java.util.Scanner;

public class IndicarMaior {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		int n = input.nextInt();
		System.out.print("Insira um numero: ");
		int nn = input.nextInt();
		System.out.print("Insira um numero: ");
		int nnn = input.nextInt();
		if (n > nn && n > nnn) {
			System.out.print("O maior é:  " + n);

		} else if (nn > n && nn > nnn) {
			System.out.print("O maior é:  " + nn);
		} else if (nnn > nn && nnn > n) {
			System.out.print("O maior é: " + nnn);
		}

		input.close();
	}

}
