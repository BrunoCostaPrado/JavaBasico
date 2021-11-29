package exercicio;

import java.util.Scanner;

public class RealDolar {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a, b, c;
		System.out.println("Insira a cotação do dolar");
		a = input.nextFloat();
		System.out.println("Insira o valor em real");
		b = input.nextFloat();
		c = a * b;
		System.out.println("O valor em dolar é: " + c + " dolares");
		input.close();

	}

}
