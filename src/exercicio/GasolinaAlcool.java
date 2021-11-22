package exercicio;

import java.util.Scanner;

public class GasolinaAlcool {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float r;
		System.out.print("1 para Gasolina, 2 para alcool: ");
		int s = input.nextInt();
		System.out.print("Quantos litros?: ");
		float l = input.nextFloat();
		if (s == 1 && l > 20) {
			r = (l * 3.3f) - ((l * 3.3f) / 100 * 4);
			System.out.print("R$:" + r);
		} else if (s == 1 && l <= 20) {
			r = (l * 3.3f) - ((l * 3.3f) / 100 * 6);
			System.out.print("R$:" + r);
		} else if (s == 2 && l > 20) {
			r = (l * 2.9f) - ((l * 2.9f) / 100 * 3);
			System.out.print("R$:" + r);
		} else if (s == 2 && l <= 20) {
			r = (l * 2.9f) - ((l * 2.9f) / 100 * 5);
			System.out.print("R$:" + r);
		}
		input.close();
	}

}
