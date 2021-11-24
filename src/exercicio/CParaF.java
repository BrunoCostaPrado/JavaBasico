package exercicio;

import java.util.Scanner;

public class CParaF {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int c;
		System.out.println("Insira a temperatura em Cº");
		c = input.nextInt();
		float f = (9 * c + 160) / 5;
		System.out.println("A temperatura é "+f+"Fº");
		input.close();

	}

}
