import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Girilen sayıya kadar çift olan sayıları bulan programı yazınız.
        Scanner scanner = new Scanner(System.in);
        int k;
        System.out.print("Lütfen bir sayı giriniz: ");
        k = scanner.nextInt();

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        // Ödev Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e
        // tam bölünen sayıların ortalamasını hesaplayan programı yazınız.
        System.out.println("--- Ödev ---");
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = scanner.nextInt();
        scanner.close();

        int total = 0;
        int count = 0;
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                total += i;
                count++;
            }
        }

        System.out.print("0' dan " + number + "sayısına kadar olan 3 ve 4' e tam bölünebilen sayıların ortalaması: ");
        System.out.println(total / count);
    }
}
