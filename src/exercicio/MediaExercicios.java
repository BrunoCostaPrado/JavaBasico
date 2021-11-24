package exercicio;

import java.util.Scanner;

public class MediaExercicios {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a, b, c, d, e;
		System.out.println("Insira a primeira nota");
		a = input.nextFloat();
		System.out.println("Insira a segunda nota");
		b = input.nextFloat();
		System.out.println("Insira a terceira nota");
		c = input.nextFloat();
		System.out.println("insira a media dos exercicios");
		d = input.nextFloat();
		e = (a + (b * 2) + (c * 3) + d) / 7;
		if (e < 6) {
			System.out.println("Nota D");
		} else if (e >= 6&&e<7.5) {
			System.out.println("Nota C");
		} else if (e > 7.5&&e<9) {
			System.out.println("Nota B");
		} else if (e >= 9) {
			System.out.println("Nota A");
		}
		input.close();
	}

}
