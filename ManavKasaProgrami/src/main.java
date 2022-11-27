import java.util.Scanner;

public class main {
	public static void main(String[] args) {

		// Alınan Urunlerin Kilosuna Göre Fiyatini Hesapliyoruz; 
		// Armut : 2,14 TL, Elma : 3,67 TL, Domates : 1,11 TL, Muz:0,95 TL, Patlıcan : 5,00 TL

		double armut, elma, domates, muz, patlican, toplamTutar;

		Scanner sc = new Scanner(System.in);

		System.out.println("Kaç kg armut aldınız? ");
		armut = sc.nextDouble();

		System.out.println("Kaç kg elma aldınız? ");
		elma = sc.nextDouble();

		System.out.println("Kaç kg domates aldınız? ");
		domates = sc.nextDouble();

		System.out.println("Kaç kg muz aldınız? ");
		muz = sc.nextDouble();

		System.out.println("Kaç kg patlıcan aldınız? ");
		patlican = sc.nextDouble();

		toplamTutar = ((armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.00));
		System.out.println("Toplam tutar: " + toplamTutar);

	}
}
