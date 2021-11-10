package exercicio;

import java.util.Scanner;

public class Subtracão {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite um valor:");
		int v1 = sc.nextInt();
		System.out.print("Digite um valor:");
		int v2 = sc.nextInt();
		int v3 = v1 - v2;
		System.out.println("O resultado é " + v3);
		sc.close();
	}
}