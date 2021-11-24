package exercicio;

import java.util.Scanner;

public class Prestacao {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int c, d;
		System.out.println("Insira o valor");
		float b = input.nextInt();
		System.out.println("Insira a taxa");
		c = input.nextInt();
		System.out.println("Insira o tempo");
		d = input.nextInt();
		float a = b * (b * c / 100) * d;
		System.out.println("A prestação é R$" + a);
		input.close();
	}

}
