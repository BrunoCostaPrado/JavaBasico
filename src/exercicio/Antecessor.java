package exercicio;

import java.util.Scanner;

public class Antecessor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um numero: ");
		int v1 = sc.nextInt();
		int v2 = v1 - 1;
		System.out.print("O antecessor é: " + v2);
		sc.close();
	}

}
