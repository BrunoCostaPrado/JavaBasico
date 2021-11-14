package exercicio;

import java.util.Scanner;

public class MaiorQue {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insira um numero: ");
		int a= input.nextInt();
		if (a > 10){
			System.out.print(a+" é maior que 10");
		}
		else (a > 10){
			System.out.print(a+ "é menor que 10");
		}
		
		input.close();
	}

}
