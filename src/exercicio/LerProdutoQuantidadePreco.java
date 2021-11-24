package exercicio;

import java.util.Scanner;

public class LerProdutoQuantidadePreco {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		float b, d, t, tt;
		String c;
		System.out.print("Nome do produto: ");
		c = input.next();
		System.out.print("Insira a quantiade adquirida: ");
		a = input.nextInt();
		System.out.print("Insira o preço: ");
		b = input.nextFloat();
		t = a * b;

		if (a <= 5) {
			d = t * 2 / 100;
			tt = t - d;
			System.out.println("O preço de " + c + " é R$" + tt);
		} else if (a > 5 && a <= 10) {
			d = t * 3 / 100;
			tt = t - d;
			System.out.println("O preço de " + c + " é R$" + tt);
		} else if (a > 10) {
			d = t * 5 / 100;
			tt = t - d;
			System.out.println("O preço de " + c + " é R$" + tt);
		}
		input.close();

	}

}
