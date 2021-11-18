package exercicio;

import java.util.Scanner;

public class TesteMesa {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n1, n2, n3;
		System.out.print("Insira o numero:");
		n1 = input.nextInt();
		System.out.print("Insira o numero:");
		n2 = input.nextInt();
		n3 = (n1 * n2) + 5;
		System.out.println(n3);
		if (n3 == 0) {
			System.out.print("A");
		} else if (n3 <= 100) {
			System.out.print("B");
		} else {
			System.out.print("C");
		}
		input.close();
	}

}
