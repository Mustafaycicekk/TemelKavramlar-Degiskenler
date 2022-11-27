import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		double tutar, kdvOran= 0, kdvTutar, kdvliTutar ;
		Scanner sc = new Scanner(System.in);
		System.out.println("Toplam Tutarı Giriniz: ");
		tutar = sc.nextDouble();
		
		if(tutar > 1000) {
			kdvOran = 0.08;
		}else{
			kdvOran = 0.18;
		}
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		
		System.out.println("KDV'siz Tutar: "+ tutar);
		System.out.println("KDV Oranı: " + kdvOran);
		System.out.println("KDV Tutarı: " + kdvTutar);
		System.out.println("KDV'li Tutar: " + kdvliTutar);
		
	}
}
