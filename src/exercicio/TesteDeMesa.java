package exercicio;

import java.util.Scanner;

public class TesteDeMesa {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c;
		System.out.println("Insira a");
		a = input.nextInt();
		System.out.println("Insira b");
		b = input.nextInt();
		System.out.println("Insira c");
		c = input.nextInt();
		if (a < b + c && b < a + c && c < a + b) {
		}
		input.close();
	}

}
