package notOrtalama;

import java.util.Scanner;

public class Hesapla {

	public static void main(String[] args) {
		/* Ödev
		 
		 Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını 
		 kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastıran programı yazın.
		 Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 
		 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
		 
		*/
		Scanner scanner = new Scanner(System.in);
		int matematik, fizik, kimya, turkce, tarih, muzik;
		
		System.out.print("Matematik Notunuz: ");
		matematik = scanner.nextInt();
		
		System.out.print("Fizik Notunuz: ");
		fizik = scanner.nextInt();
		
		System.out.print("Kimya Notunuz: ");
		kimya = scanner.nextInt();
		
		System.out.print("Türkçe Notunuz: ");
		turkce = scanner.nextInt();
		
		System.out.print("Tarih Notunuz: ");
		tarih = scanner.nextInt();
		
		System.out.print("Müzik Notunuz: ");
		muzik = scanner.nextInt();
		
		scanner.close();
		
		double ortalama = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;
		
		System.out.println("Ortalamanız: " + ortalama);
		System.out.println(ortalama > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
		
	}

}
