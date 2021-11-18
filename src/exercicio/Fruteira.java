package exercicio;

import java.util.Scanner;

public class Fruteira {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float m, mm, r, rr,t;
		System.out.print("Insira a quantidade maças: ");
		m = input.nextFloat();
		System.out.print("Insira a quantidade maças: ");
		mm = input.nextFloat();
		if (m < 5 && m < 5) {
			r = (m * 2.5f);
			rr = (mm * 1.8f);
			System.out.print("Maças custam R$:" + r);
			System.out.print("Morangos custam R$:" + rr);
		} else if (m > 5 && mm > 5) {
			r = (m * 2.8f);
			rr = (mm * 1.5f);
			System.out.print("Maças custam R$:" + r);
			System.out.print("Morangos custam R$:" + rr);
		}
	}

}
