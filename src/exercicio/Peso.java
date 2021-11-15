package exercicio;

import java.util.Scanner;

public class Peso {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira seu sexo, 1 para Masculino e 2 para Feminino: ");
		int s = input.nextInt();
		System.out.print("Insira sua altura: ");
		float a = input.nextFloat();
		float c = ((72.7f * a) - 58);
		float cc = ((62.1f * a) - 44.7f);
		if (s == 1) {
			System.out.print("Peso ideal é: "+c);
		} else if (s > 2) {
			System.out.print("Algo esta errado");
		} else {
			System.out.print("Peso ideal é: "+cc);
		}
		input.close();
	}
}
