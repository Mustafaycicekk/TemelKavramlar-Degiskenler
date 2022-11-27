import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		double kenarA, kenarB, kenarC, cevre, u, alan;
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Kenarı Giriniz: ");
		kenarA = sc.nextInt();
		System.out.println("2. Kenarı Giriniz: ");
		kenarB = sc.nextInt();
		System.out.println("3. Kenarı Giriniz: ");
		kenarC = sc.nextInt();

		u = (kenarA + kenarB + kenarC) / 2;
		cevre = (2 * u);
		alan = Math.sqrt(u * (u - kenarA) * (u - kenarB) * (u - kenarC));		
		System.out.println("Üçgenin Çevresi : " + cevre);
		System.out.println("Üçgenin Alanı : " + alan);

	}
}
