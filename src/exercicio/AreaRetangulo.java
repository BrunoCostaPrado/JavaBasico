package exercicio;

import java.util.Scanner;

public class AreaRetangulo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira a base: ");
		int b = sc.nextInt();
		System.out.print("Insira o lado: ");
		int l = sc.nextInt();
		System.out.print("A area é: "+b*l);
		sc.close();
	}

}
