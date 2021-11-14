package exercicio;

import java.util.Scanner;

public class MediaAritimatica {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira a nota1: ");
		float a = input.nextFloat();
		System.out.print("Insira a nota2: ");
		float b = input.nextFloat();
		float c = (a + b) / 2;
		if (c<6) {
			System.out.print("Aluno reprovado, media: "+c);
		}
		else {System.out.print("Aluno aprovado, media: "+c);}
		input.close();
	}

}
