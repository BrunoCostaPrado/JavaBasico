package exercicio;

import java.util.Scanner;

public class Idade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite seus anos vividos:");
		int a = sc.nextInt();
		System.out.print("Digite seus meses vividos:");
		int m = sc.nextInt();
		System.out.print("Digite seus dias vividos:");
		int d = sc.nextInt();
		int r = (a * 365) + (m * 30) + d;
		System.out.println("Sua idade em dias é: " + r);
		sc.close();
	}
}
