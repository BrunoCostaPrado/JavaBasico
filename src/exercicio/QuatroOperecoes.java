package exercicio;

import java.util.Scanner;

public class QuatroOperecoes {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a, b, c, d, r, rr, rrr, rrrr;
		System.out.println("Insira o numero");
		a = input.nextInt();
		System.out.println("Insira o numero");
		b = input.nextInt();
		System.out.println("Insira o numero");
		c = input.nextInt();
		System.out.println("Insira o numero");
		d = input.nextInt();
		r = a + b;
		rr = a * b;
		rrr = a + c;
		rrrr = a * c;
		int aa = a + d;
		int aaa = a * d;
		int g = b + c;
		int gg = b * c;
		int f = b + d;
		int ff = b * d;
		int h = c + d;
		int hh = c * d;
		System.out.println("a+b:" + r);
		System.out.println("a*b:" + rr);
		System.out.println("a+c:" + rrr);
		System.out.println("a*c:" + rrrr);
		System.out.println("a+d:" + aa);
		System.out.println("a*d:" + aaa);
		System.out.println("b+c:" + g);
		System.out.println("b*c:" + gg);
		System.out.println("b+d:" + f);
		System.out.println("b*d:" + ff);
		System.out.println("c+d:" + h);
		System.out.println("c*d:" + hh);
		input.close();
	}

}
