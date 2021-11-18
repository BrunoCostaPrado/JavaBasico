package exercicio;

import java.util.Scanner;

public class SomarMaiores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		int n = input.nextInt();
		System.out.print("Insira um numero: ");
		int nn = input.nextInt();
		System.out.print("Insira um numero: ");
		int nnn = input.nextInt();
		if (n > nn && nn > nnn) {
			int r = n + nn;
			System.out.print("A soma dos maiores é " + r);
		} else if (nn > n && nnn > n) {
			int r = nn + nnn;
			System.out.print("A soma dos maiores é " + r);
		} else if (nnn > nn && n > nn) {
			int r = nnn + n;
			System.out.print("A soma dos maiores é " + r);
		} else if (n == nn && n == nnn && nn == nnn && nnn == n) {
			System.out.print("Numeros iguais");
		}

		input.close();
	}

}
