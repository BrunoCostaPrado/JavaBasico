package exercicio;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira a temperatura em �F: ");
		int i = input.nextInt();
		float c = (i - 32) * 5 / 9;
		System.out.print("Temperatura em �C: "+c);
		input.close();
	}
}