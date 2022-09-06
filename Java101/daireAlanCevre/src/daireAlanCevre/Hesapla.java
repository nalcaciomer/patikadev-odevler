package daireAlanCevre;

import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		/*
		 Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini 
		 hesaplayan programı yazın.
		Alan Formülü : π * r * r;
		Çevre Formülü : 2 * π * r;
		Ödev
		Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
		𝜋 sayısını = 3.14 alınız.
		Formül : (𝜋 * (r*r) * 𝛼) / 360
		 */
		Scanner scanner = new Scanner(System.in);
		final double PI = 3.14;
		double area, circumference, areaOfCircleSegment;
		int r, a;
		
		System.out.print("Dairenin yarıçapını giriniz: ");
		r = scanner.nextInt();
		
		area = PI * Math.pow(r, 2);
		circumference = 2 * PI * r;
		
		System.out.println("Alan: " + area);
		System.out.println("Çevre: " + circumference);
		System.out.println("*** Ödev ***");
		System.out.println("Daire diliminin alanını bulma");
		
		System.out.print("Yarıçapı giriniz: ");
		r = scanner.nextInt();
		
		System.out.print("Merkez açının ölçüsünü giriniz: ");
		a = scanner.nextInt();
		
		scanner.close();
		
		areaOfCircleSegment = (PI * Math.pow(r, 2) * a) / 360;
		
		System.out.println("Daire diliminin alanı: " + areaOfCircleSegment);
	}

}
