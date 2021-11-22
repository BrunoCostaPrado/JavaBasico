package exercicio;

import java.util.Scanner;

public class Eleicão {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o numero de eleitores:");
		int et = sc.nextInt();
		System.out.print("Digite o numero de votos em branco:");
		int vb = sc.nextInt();
		System.out.print("Digite o numero de votos nulos:");
		int vn = sc.nextInt();
		System.out.print("Digite o numero de votos validos:");
		int vv = sc.nextInt();
		int vvb = (vb * 100 / et);
		int vvn = (vn * 100 / et);
		int vvv = (vv * 100 / et);
		System.out.println("A porcentagem de votos em branco é: " + vvb + "%");
		System.out.println("A porcentagem de votos nulos é: " + vvn + "%");
		System.out.print("A porcentagem votos validos é: " + vvv + "%");
		sc.close();

	}
}
