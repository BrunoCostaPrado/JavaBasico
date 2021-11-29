package exercicio;

import java.util.Scanner;

public class Aposentadoria {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, d, e, f;
		d = 2021;
		System.out.println("Insira seu codigo");
		a = input.nextInt();
		System.out.println("Insira sua data de nascimento");
		b = input.nextInt();
		System.out.println("Insira sua data de contratação");
		c = input.nextInt();
		e = d - b;
		f = d - c;
		System.out.println("Codigo Nº"+a);
		if (e < 65) {
			System.out.println("Não requer" + " " + e + " " + f);
		} else if (e >= 65) {
			System.out.println("Requer aposentadoria" + " " + e + " " + f);
		} else if (f < 30) {
			System.out.println("Não requer" + " " + e + " " + f);
		} else if (f >= 30) {
			System.out.println("Requer aposentadoria" + " " + e + " " + f);
		} else if (e >= 60 && f >= 25) {
			System.out.println("Requer aposentadoria" + " " + e + " " + f);
		}
		input.close();
	}

}
