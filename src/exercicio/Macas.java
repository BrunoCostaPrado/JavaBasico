package exercicio;

import java.util.Scanner;

public class Macas {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Quantas ma�as foram compradas? ");
		int m = input.nextInt();
		if (m < 12) {
			float mm = (m * 1.3f);
			System.out.print("O pre�o � R$" + mm);
		} else {
			float mmm = m * 1;
			System.out.print("O pre�o � R$" + mmm);
		}
		input.close();
	}
}
