package exercicio;

import java.util.Scanner;

public class MaiorQue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		float a = input.nextFloat();
		if (a > 10) {
			System.out.print(a + " � maior que 10");
		}
		else if(a>=10) {System.out.print(a+" � igual a 10");}
		else {
			System.out.print(a + " � menor que 10");
		}
		input.close();
	}
}
