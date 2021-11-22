package exercicio;

import java.util.Scanner;

public class Fruteira {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float m, mm, r, rr;
		System.out.print("Insira a quantida de maças: ");
		m = input.nextFloat();
		System.out.print("Insira a quantida de morangos: ");
		mm = input.nextFloat();
		if (m < 5 && m < 5) {
			r = (m * 2.5f);
			rr = (mm * 1.8f);
			System.out.print("Maças custam R$:" + r);
			System.out.print("Morangos custam R$:" + rr);
		} else if (m > 5 && mm > 5) {
			r = (m * 2.8f);
			rr = (mm * 1.5f);
			System.out.println("Maças custam R$:" + r);
			System.out.print("Morangos custam R$:" + rr);
		}input.close();
	}

}
