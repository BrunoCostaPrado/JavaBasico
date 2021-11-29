package exercicio;

import java.util.Scanner;

public class DolarReal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		float a, b, c, d;
		System.out.println("Insira a cotação do dolar");
		a = input.nextFloat();
		System.out.println("Insira a quantidade a ser convertida");
		b = input.nextFloat();
		c=a*b*100;
		System.out.println("O valor em reais é: "+c+ " reais");
		input.close();

	}

}
