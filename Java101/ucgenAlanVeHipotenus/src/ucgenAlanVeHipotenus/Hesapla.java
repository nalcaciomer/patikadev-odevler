package ucgenAlanVeHipotenus;

import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		/* 
		 
		***Dik Üçgende Hipotenüs Bulan Program**
		Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.
		
		***Ödev**
		Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.
		Formül
		Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
		𝑢 = (a+b+c) / 2
		Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
		 
		 */
		
		//hipotenusHesapla();
		
		alanHesapla();
		
	}

	private static void alanHesapla() {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("Üçgenin kenar uzunluklarını giriniz: ");
		System.out.print("a: ");
		a = scanner.nextInt();
		System.out.print("b: ");
		b = scanner.nextInt();
		System.out.print("c: ");
		c = scanner.nextInt();
		
		scanner.close();
		
		double u = (a + b + c) / 2;
		
		double alan = Math.sqrt(u * (u - a) * (u - b) * (u - c));
		
		System.out.println("Üçgenin alanı: " + alan);
	}

	private static void hipotenusHesapla() {
		
		Scanner scanner = new Scanner(System.in);
		int a, b;
		double c;
		
		System.out.print("Dik üçgenin a kenarını giriniz: ");
		a = scanner.nextInt();
		
		System.out.print("Dik üçgenin b kenarını giriniz: ");
		b = scanner.nextInt();
		
		scanner.close();
		
		c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("Hipotenüs: " + c);
	}

}
