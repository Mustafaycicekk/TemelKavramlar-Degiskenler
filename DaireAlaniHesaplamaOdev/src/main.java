import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		int r, acı;
        double alan, pi = Math.PI;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen dairenin yarıçapını yazınız: ");
        r = input.nextInt();

        System.out.print("Lütfen merkez açısısının ölçüsünü yazınız: ");
        acı = input.nextInt();

        alan = (pi * (r*r) * acı) / 360;
        System.out.println("Daire diliminin alanı : " + alan);
		
	}
}
