import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
         * Geçme Notu : 55
         * Ödev
         * Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya
         * katılmasın.
         */

        Scanner scanner = new Scanner(System.in);
        int math, physics, turkish, chemistry, music;
        int total = 0, lessonCount = 0;
        double avarage = 0;

        System.out.print("Matematik Notunuz: ");
        math = scanner.nextInt();
        if (!(math < 0 || math > 100)) {
            total += math;
            lessonCount++;
        }

        System.out.print("Fizik Notunuz: ");
        physics = scanner.nextInt();
        if (!(physics < 0 || physics > 100)) {
            total += physics;
            lessonCount++;
        }

        System.out.print("Türkçe Notunuz: ");
        turkish = scanner.nextInt();
        if (!(turkish < 0 || turkish > 100)) {
            total += turkish;
            lessonCount++;
        }

        System.out.print("Kimya Notunuz: ");
        chemistry = scanner.nextInt();
        if (!(chemistry < 0 || chemistry > 100)) {
            total += chemistry;
            lessonCount++;
        }

        System.out.print("Müzik Notunuz: ");
        music = scanner.nextInt();
        if (!(music < 0 || music > 100)) {
            total += music;
            lessonCount++;
        }

        scanner.close();

        avarage = total / lessonCount;
        if (avarage <= 55) {
            System.out.println("Sınıfta Kaldınız!");
        } else {
            System.out.println("Tebrikler sınıfı geçtiniz!");
            System.out.println("Ortalamınız: " + avarage);
        }

    }
}
