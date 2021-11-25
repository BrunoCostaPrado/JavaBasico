package exercicio;

import java.util.Scanner;

public class TrocarValores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b;
		a = 50;
		b = 60;
		b = a;
		a = b;
		System.out.println("Insira o numero");
		a = input.nextInt();
		System.out.println("Insira o numero");
		b = input.nextInt();
		System.out.println(a);
		System.out.println(b);
		input.close();
	}

}
