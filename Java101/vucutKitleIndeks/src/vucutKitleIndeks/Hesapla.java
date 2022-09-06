package vucutKitleIndeks;

import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		/*
		 
		 Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. 
		 Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp 
		 ekrana yazdırın.
		 Formül
		 Kilo (kg) / ( Boy(m) * Boy(m) )
		 
		 */
		
		Scanner scanner = new Scanner(System.in);
		double height, weight, bodyMassIndex;
		
		System.out.print("Lütfen boyunuzu metre cinsinde giriniz: ");
		height = scanner.nextDouble();
		
		System.out.print("Lütfen kilonuzu giriniz: ");
		weight = scanner.nextDouble();
		
		scanner.close();
		
		bodyMassIndex = weight / (Math.pow(height, 2));
		
		System.out.println("Vücut Kitle İndeksiniz: " + bodyMassIndex);
	}

}
