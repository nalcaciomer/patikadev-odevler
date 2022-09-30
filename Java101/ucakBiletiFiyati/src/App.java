import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı
         * yapın. Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
         * bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak
         * uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye
         * aşağıdaki indirimleri uygulayın ;
         * 
         * Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı,
         * yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
         * "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
         * Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
         * Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
         * Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
         * Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20
         * indirim uygulanır.
         */
        Scanner scanner = new Scanner(System.in);

        int distance, age, travelType;
        double ticketPrice, childDiscount = 0.50, teenagerDiscount = 0.10, olderDiscount = 0.30,
                travelTypeDiscount = 0.20;

        System.out.print("Mesafeyi km türünden giriniz : ");
        distance = scanner.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        age = scanner.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        travelType = scanner.nextInt();

        scanner.close();

        if ((distance > 0) && (age > 0) && (travelType == 1 || travelType == 2)) {
            ticketPrice = distance * 0.10;
            if (age < 12) {
                ticketPrice = ticketPrice - (ticketPrice * childDiscount);

            } else if (age >= 12 && age <= 24) {
                ticketPrice = ticketPrice - (ticketPrice * teenagerDiscount);
            } else if (age > 65) {
                ticketPrice = ticketPrice - (ticketPrice * olderDiscount);
            }

            if (travelType == 2) {
                ticketPrice = (ticketPrice - (ticketPrice * travelTypeDiscount)) * 2;
            }

            System.out.println("Toplam Tutar = " + ticketPrice + " TL");
        }

        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

    }
}
