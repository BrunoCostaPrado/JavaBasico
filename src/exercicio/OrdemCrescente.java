package exercicio;

import java.util.Scanner;

public class OrdemCrescente {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n, nn, nnn;
		System.out.print("Insira um numero: ");
		n = input.nextInt();
		System.out.print("Insira um numero: ");
		nn = input.nextInt();
		System.out.print("Insira um numero: ");
		nnn = input.nextInt();
		if (n > nn && n > nnn && nn > nnn) {
			System.out.print("Ordem Crescente: " + nnn + ", " + nn + ", " + n);
		} else if (nn > n && nn > nnn & n > nnn) {
			System.out.print("Ordem Crescente: " + nnn + ", " + n + ", " + nn);
		} else if (nnn > n && nnn > nn && n > nn) {
			System.out.print("Ordem Crescente: " + nn + ", " + n + ", " + nnn);
		} else if (nn > n && nn > nnn && nnn > n) {
			System.out.print("Ordem Crescente: " + n + ", " + nnn + ", " + nn);
		}

		else if (nnn > nn && nnn > n & nn > n) {
			System.out.print("Ordem Crescente: " + n + ", " + nn + ", " + nnn);
		}
		input.close();
	}
}
