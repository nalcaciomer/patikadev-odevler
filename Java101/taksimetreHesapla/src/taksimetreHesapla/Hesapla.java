package taksimetreHesapla;

import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		/* 
		
		Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
		Taksimetre KM başına 2.20 TL tutmaktadır.
		Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
		Taksimetre açılış ücreti 10 TL'dir.

		 */
		
		Scanner scanner = new Scanner(System.in);
		int km;
		double perKm = 2.20, startPrice = 10, total;
		
		System.out.println("Km giriniz: ");
		km = scanner.nextInt();
		
		scanner.close();
		
		total = startPrice + (km * perKm);
		total = (total < 20) ? 20 : total;
		
		System.out.println("Taksimetre Tutarı: " + total);
		
	}

}
