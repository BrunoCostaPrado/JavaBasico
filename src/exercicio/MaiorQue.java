package exercicio;

import java.util.Scanner;

public class MaiorQue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		float a = input.nextFloat();
		if (a > 10) {
			System.out.print(a + " é maior que 10");
		}
		else if(a>=10) {System.out.print(a+" é igual a 10");}
		else {
			System.out.print(a + " é menor que 10");
		}
		input.close();
	}
}
