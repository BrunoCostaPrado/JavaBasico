package exercicio;

import java.util.Scanner;

public class QuadradoArea {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o lado: ");
		int v = sc.nextInt();
		int v2 = v * v;
		System.out.printf("A area é: " + v2);
		sc.close();
	}

}
