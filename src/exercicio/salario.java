package exercicio;


import java.util.Scanner;

public class Salario {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o salario atual: ");
		int sa = input.nextInt();
		System.out.print("Digite o ajuste: ");
		float a = input.nextFloat();
		float as = (sa * a / 100 + sa);
		System.out.print("O salario com o ajuste é: " + as);
		input.close();
	}
}
