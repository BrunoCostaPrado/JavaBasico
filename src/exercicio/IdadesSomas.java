package exercicio;

import java.util.Scanner;

public class IdadesSomas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int r;
		System.out.print("Insira a idade do primeiro Homem: ");
		int a = input.nextInt();
		System.out.print("Insira a idade da segunda Homem: ");
		int aa = input.nextInt();
		System.out.print("Insira a idade da primeiro Mulher: ");
		int b = input.nextInt();
		System.out.print("Insira a idade da segunda Mulher: ");
		int bb = input.nextInt();
		if (a > aa && b > bb) {
			r = a + bb;
			System.out.print("A soma da idade do Homem mais velho e da mulher mais nova é " + r);
		} else if (a > aa && b > bb) {
			r = aa + b;
			System.out.print("A soma da idade do Homem mais novo e da mulher mais velha é " + r);
		} else if (a < aa && b < bb) {
			r = a + bb;
			System.out.print("A soma da idade do Homem mais velho e da mulher mais nova é " + r);
		} else if (a < aa && b < bb) {
			r = aa + b;
			System.out.print("A soma da idade do Homem mais novo e da mulher mais velha é " + r);
		}
		input.close();
	}
}
