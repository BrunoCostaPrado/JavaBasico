package exercicio;

import java.util.Scanner;

public class ComissaoCarro {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira o salario: ");
		float s = input.nextFloat();
		System.out.print("Insira a quantidade de carros vendido: ");
		int c = input.nextInt();
		float cm = s + c;
		System.out.print("Insira o numero de vendas: ");
		int v = input.nextInt();
		int cm2 = v / 100 * 5;
		float sf = s + cm + cm2;
		System.out.print("Salario final: " + sf);
		input.close();

	}

}
