package exercicio;

import java.util.Scanner;

public class VerificarTriangulo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o lado: ");
		float l1 = input.nextFloat();
		System.out.print("Insira o lado: ");
		float l2 = input.nextFloat();
		System.out.print("Insira o lado: ");
		float l3 = input.nextFloat();
		float r1 = l1 + l2;
		float r2 = l1 + l3;
		float r3 = l2 + l3;
		if (r1 > l1 && r1 > l2 && r1 > l3 && r2 > l1 && r2 > l2 && r2 > l3 && r3 > l1 && r3 > l2 && r3 > l3) {
			System.out.print("Não forma um triangulo");
		} else if (r1 < l1 && r1 < l2 && r1 < l3 && r2 < l1 && r2 < l2 && r2 < l3 && r3 < l1 && r3 < l2 && r3 < l3) {
			System.out.print("Forma um triangulo");
		}
		System.out.print(r1 + r2 + r3);
		input.close();
	}

}
