package exercicio;

import java.util.Scanner;

public class SalarioComissao {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira seu salario: ");
		float s = input.nextFloat();
		System.out.print("Insira o valor total de suas vendas: ");
		float v = input.nextFloat();

		if (v < 1500) {
			float vv = v * 3 / 100;
			float sf = vv + s;
			System.out.print("Salario final é: R$" + sf);
		} else {
			float vv = v * 5 / 100;
			float sf = vv + s;
			System.out.print("Salario final é: R$" + sf);
		}
		input.close();
	}

}
