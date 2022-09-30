import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.print("1. Sayı = ");
        a = scanner.nextInt();

        System.out.print("2. Sayı = ");
        b = scanner.nextInt();

        System.out.print("3. Sayı = ");
        c = scanner.nextInt();

        scanner.close();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println("a < b < c");
            } else if (c < b) {
                System.out.println("a < c < b");
            } else {
                System.out.println("a < b = c");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println("b < a < c");
            } else if (c < a) {
                System.out.println("b < c < a");
            } else {
                System.out.println("b < a = c");
            }
        }

        else if ((c < a) && (c < b)) {
            if (a < b) {
                System.out.println("c < a < b");
            } else if (b < a) {
                System.out.println("c < b < a");
            } else {
                System.out.println("c < a = b");
            }
        }

        else if (a == b) {
            if (a < c) {
                System.out.println("a = b < c");
            }

            else if (c < a) {
                System.out.println("c < a = b");
            } else {
                System.out.println("a = b = c");
            }
        }

        else if (a == c) {
            if (a < b) {
                System.out.println("a = c < b");
            } else if (b < a) {
                System.out.println("b < a = c");
            } else {
                System.out.println("a = b = c");
            }
        }

    }
}
