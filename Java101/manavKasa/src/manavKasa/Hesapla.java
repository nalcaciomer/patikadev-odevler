package manavKasa;

import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		/*
		 
		 Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine 
		 göre toplam tutarını ekrana yazdıran programı yazın.
		 Meyveler ve KG Fiyatları
		 Armut : 2,14 TL
		 Elma : 3,67 TL
		 Domates : 1,11 TL
		 Muz: 0,95 TL
		 Patlıcan : 5,00 TL
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.00, toplam;
		int armutKg, elmaKg, domatesKg, muzKg, patlicanKg;
		
		System.out.print("Armut Kaç Kilo? : ");
		armutKg = scanner.nextInt();
		
		System.out.print("Elma Kaç Kilo? : ");
		elmaKg = scanner.nextInt();
		
		System.out.print("Domates Kaç Kilo? : ");
		domatesKg = scanner.nextInt();
		
		System.out.print("Muz Kaç Kilo? : ");
		muzKg = scanner.nextInt();
		
		System.out.print("Patlıcan Kaç Kilo? : ");
		patlicanKg = scanner.nextInt();
		
		scanner.close();
		
		toplam = (armut * armutKg) + (elma * elmaKg) + (domates * domatesKg) + (muz * muzKg) + (patlican * patlicanKg);
		
		System.out.println("Toplam Tutar: " + toplam + " TL");
	}

}
