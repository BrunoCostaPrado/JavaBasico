package exercicio;

import java.util.Scanner;

public class EstoqueCompra {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o estoque atual: ");
		int a = input.nextInt();
		System.out.print("Insira o estoque maximo: ");
		int b = input.nextInt();
		System.out.print("Insira o estoque minimo: ");
		int c = input.nextInt();
		int d = (b + c) / 2;
		if (a >= d) {
			System.out.print("Nâo efetuar compra");
		} else {
			System.out.print("Efetuar compra");
		}

		input.close();
	}

}
