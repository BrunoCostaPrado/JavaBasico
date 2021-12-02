package exemplo;

public class Math1 {

	public static void main(String[] args) {
		int v1;
		v1 = 25;
		var v2 = 1.5;
		System.out.println(Math.max(v1, v2));
		System.out.println(Math.min(v1, v2));
		System.out.println(Math.sqrt(v1));
		System.out.println(Math.abs(-12));
		System.out.println(Math.abs(12));
		System.out.println(Math.random());
		int v3 = (int) (Math.random() * 101);
		System.out.println(v3);
	}

}
