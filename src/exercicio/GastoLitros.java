package exercicio;

import java.util.Scanner;

public class GastoLitros {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float v, t, d, l;
		System.out.println("Insira o tempo gasto");
		t = input.nextFloat();
		System.out.println("Insira a velocidade");
		v = input.nextFloat();
		d = v * t;
		l = d / 12;
		System.out.println(d);
		System.out.println(l);
		input.close();

	}

}
