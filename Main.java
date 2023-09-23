package kdvPrice;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		  double fiyat, kdv = 0.18;

	        Scanner inp = new Scanner(System.in);
	        System.out.print("Lütfen KDV hesaplanacak Tutarı giriniz : ");
	        fiyat = inp.nextDouble();

	        double kdvTutari= kdv * fiyat;
	        double kdvliTutar= fiyat+kdvTutari;

	        System.out.println("KDV'siz Fiyat = " + fiyat);
	        System.out.println("KDV Oranı = " + kdv);
	        System.out.println("KDV'li Fiyat = " + kdvliTutar);
	        System.out.println("KDV tutarı = " + kdvTutari);
		

	}

}
