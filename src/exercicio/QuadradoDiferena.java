package exercicio;

import java.util.Scanner;

public class QuadradoDiferena {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		System.out.println("Insira um numero");
		a = input.nextInt();
		System.out.println("Insira um numero");
		b = input.nextInt();
		c = a - b;
		d = c * c;
		System.out.println("O quadrado da diferença é :" + d);
		input.close();
	}

}
