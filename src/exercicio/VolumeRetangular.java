package exercicio;

import java.util.Scanner;

public class VolumeRetangular {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		float d;
		System.out.println("Insira o comprimento");
		a = input.nextInt();
		System.out.println("Insira a largura");
		b = input.nextInt();
		System.out.println("Insira a altura");
		c = input.nextInt();
		d = (a * b * c);
		System.out.println("O volume é "+d+"cm³");

		input.close();

	}

}
