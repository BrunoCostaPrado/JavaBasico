package exercicio;

import java.util.Scanner;

public class Media {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira a nota1: ");
		float a = input.nextFloat();
		System.out.print("Insira a nota2: ");
		float b = input.nextFloat();
		System.out.print("Insira a nota3: ");
		float c = input.nextFloat();
		float r = (a * 2 + b * 3 + c * 5) / 10*1;
		System.out.print("Nota final: " + r);
		input.close();
	}
}
