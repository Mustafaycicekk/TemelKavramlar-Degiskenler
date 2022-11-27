import java.util.Scanner;

public class main {
public static void main(String[] args) {
		
		int mat, fizik, kimya, turkce, tarih, muzik;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Matematik Notunuz: ");
		mat = sc.nextInt();
		
		System.out.print("Fizik Notunuz: ");
		fizik = sc.nextInt();
		
		System.out.print("Kimya Notunuz: ");
		kimya = sc.nextInt();
		
		System.out.print("Türkçe Notunuz: ");
		turkce = sc.nextInt();
		
		System.out.print("Tarih Notunuz: ");
		tarih = sc.nextInt();
		
		System.out.print("Müzik Notunuz: ");
		muzik = sc.nextInt();
		
		int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
		double sonuc = toplam / 6D;
		System.out.println("Ortalamanız: " + sonuc);
		
		System.out.println( sonuc > 60 ? "Sınıfı Geçtiniz" : "Sınıfta Kaldız!");
		
		
		
		
	}

}
