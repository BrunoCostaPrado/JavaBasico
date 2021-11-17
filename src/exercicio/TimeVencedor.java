package exercicio;

import java.util.Scanner;

public class TimeVencedor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o nome do primeiro time: ");
		String t1 = input.next();
		System.out.print("Insira a quantidade de gols: ");
		int g1 = input.nextInt();
		System.out.print("Insira o nome do segundo time: ");
		String t2 = input.next();
		System.out.print("Insira a quantidade de gols: ");
		int g2 = input.nextInt();
		if (g1 > g2) {
			System.out.print("O vencedor é :" + t1);
		} else if (g1 < g2) {
			System.out.print("O vencedor é :" + t2);
		} else if (g1 == g2) {
			System.out.print("Empate");
		}
	}

}
