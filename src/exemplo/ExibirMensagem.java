package exemplo;

import java.util.Scanner;

public class ExibirMensagem {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		numero = 10;
		int valor = 5;
		System.out.println("Ol¡ MuNdO");
		System.out.println(numero);
		System.out.println(valor);
		System.out.println("Digite um valor:");
		int v1 = sc.nextInt();
		System.out.println(v1);
		sc.close();
	}

}
