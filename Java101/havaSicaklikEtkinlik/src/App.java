import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double temperature;

        System.out.print("Hava sıcaklığını giriniz: ");
        temperature = scanner.nextDouble();

        scanner.close();

        if (temperature < 5) {
            System.out.println("Kayak yapabilirsiniz.");
        } else if (temperature <= 25) {
            if (temperature <= 15) {
                System.out.println("Sinemaya gidebilirsiniz.");
            }
            if (temperature >= 10) {
                System.out.println("Piknik yapabilirsiniz.");
            }
        } else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }

    }
}
