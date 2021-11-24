package exercicio;

import java.util.Scanner;

public class UsuarioValidoInvalido {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, d;
		c = 1234;
		d = 9999;
		System.out.println("Insira o codigo de Usuario");
		a = input.nextInt();
		System.out.println("Insira a senha");
		b = input.nextInt();
		if (a != c) {
			System.out.println("Usuario invalido");
		} else if (a == c && b != d) {
			System.out.println("Senha invalida");
		} else if(a==c&&b==d) {System.out.println("Usuario e senha validos");}
		input.close();
	}
}
