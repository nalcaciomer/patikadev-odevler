package kdvHesaplama;

import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		/* 
		 Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp 
		 ekrana bastıran programı yazın.
		(Not : KDV tutarını 18% olarak alın)
		KDV'siz Fiyat = 10;
		KDV'li Fiyat = 11.8;
		KDV tutarı = 1.8;
		Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise 
		KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Tutar Giriniz: ");
		double amount = scanner.nextDouble();
		
		scanner.close();
		
		double kdvRatio = amount > 1000 ? 0.08 : 0.18;
		double kdvTaxedAmount = amount + (amount * kdvRatio);
		
		System.out.println("Girilen Tutar: " + amount);
		System.out.println("KDV Oranı: " + kdvRatio);
		System.out.println("KDV Tutarı: " + amount * kdvRatio);
		System.out.println("KDV' li Tutar: " + kdvTaxedAmount);

	}

}
