package exercicio;

import java.util.Scanner;

public class AreaCirculo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Insira o raio: ");
		int r = sc.nextInt();
		int a = Math.PI*(r *r) ;
		System.out.printf("A area é: " + a);
		sc.close();
	}

}
