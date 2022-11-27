import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int r;
		double pi = Math.PI;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Dairenin Yarıçapını Giriniz: ");
		r = sc.nextInt();
		double alan = pi * r * r;
		double cevre = 2 * pi * r;
		
		System.out.println("Dairenin Alanı: " + alan);
		System.out.println("Dairenin Çevresi: " + cevre);
		
	}
}
