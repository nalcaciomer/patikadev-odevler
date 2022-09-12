import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        /*
         * Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını
         * sorun, eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
         * ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı
         * ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa
         * "Şifre oluşturuldu" yazan programı yazınız.
         */
        Scanner scanner = new Scanner(System.in);
        String userName, password;

        System.out.print("username: ");
        userName = scanner.nextLine();

        System.out.print("password: ");
        password = scanner.nextLine();

        if (userName.equals("patika")) {
            if (password.equals("java101")) {
                System.out.println("Sisteme Giriş Başarılı!");
            } else {
                System.out.println("Şifreniz hatalı!");
                System.out.print("Şifrenizi mi unuttunuz? Şifrenizi değiştirmek istiyor musunuz? (y / n)");
                String forgetPassword = scanner.nextLine();
                switch (forgetPassword) {
                    case "y":
                        System.out.print("Yeni şifrenizi giriniz: ");
                        String newPassword = scanner.nextLine();

                        if (newPassword.equals(password) || newPassword.equals("java101")) {
                            System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                        } else {
                            System.out.println("Şifre oluşturuldu.");
                        }
                        break;

                    case "n":
                        System.out.println("Yeni şifre oluşturma reddedildi. Sistemden çıkış yapılıyor...");
                        break;

                    default:
                        System.out.println("Seçim Hatası!");
                        break;
                }

            }
        } else {
            System.out.println("Kullanıcı adınız hatalı!");
        }
        scanner.close();
    }
}
