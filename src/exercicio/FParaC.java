package exercicio;

import java.util.Scanner;

public class FParaC {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int f,ff;
		float c;
		System.out.println("Insira a temperatura em F�");
		f=input.nextInt();
		ff=f-32;
		c=ff*(5f/9f);
		System.out.println("A temperatura � "+c+"C�");
		input.close();
	}

}
