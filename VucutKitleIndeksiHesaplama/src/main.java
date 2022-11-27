import java.util.Scanner;

public class main {
	public static void main(String[] args) {
			
		double indeks;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Boyunuzu Giriniz: ");
		double boy = sc.nextDouble();
		
		System.out.print("Kilonuzu Giriniz: ");
		double kilo = sc.nextDouble();
		
		indeks = (kilo) / (boy * boy);
		System.out.println("Vücut Kitle İndeksiniz: " + indeks);
		
		
	}
}
