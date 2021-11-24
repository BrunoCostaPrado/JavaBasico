package exercicio;

import java.util.Scanner;

public class VolumeLata {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double v;
		float a, r;
		System.out.println("Insira a altura");
		a = input.nextFloat();
		System.out.println("Insira o raio");
		r = input.nextFloat();
		v = (Math.PI * r * r) * a;
		System.out.println("O volume é " + v + "cm³");
		input.close();

	}

}
