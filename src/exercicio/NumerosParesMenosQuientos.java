package exercicio;

public class NumerosParesMenosQuientos {

	public static void main(String[] args) {
		int v = 0;
		int c;
		for (c = 1; c <= 500; c++) {
			if (c % 2 == 0) {
				v = v + c;
			}
		}
		System.out.println("Soma total é:" + v);

	}

}
