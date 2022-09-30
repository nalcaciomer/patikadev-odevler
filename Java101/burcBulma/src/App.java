import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Switch-case kullanmadan burç bulan programı yazınız.

        Scanner scanner = new Scanner(System.in);
        int month, day;

        System.out.print("Doğduğunuz ayı giriniz (1-12) :");
        month = scanner.nextInt();

        System.out.println("Doğduğunuz günü giriniz (1-31) :");
        day = scanner.nextInt();

        scanner.close();

        if (month == 1) {
            if (1 <= day && day <= 31) {
                if (day <= 19) {
                    System.out.println("Oğlak Burcu");
                } else {
                    System.out.println("Kova Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 2) {
            if (1 <= day && day <= 29) {
                if (day <= 18) {
                    System.out.println("Kova Burcu");
                } else {
                    System.out.println("Balık Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 3) {
            if (1 <= day && day <= 31) {
                if (day <= 20) {
                    System.out.println("Balık Burcu");
                } else {
                    System.out.println("Koç Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 4) {
            if (1 <= day && day <= 30) {
                if (day <= 20) {
                    System.out.println("Koç Burcu");
                } else {
                    System.out.println("Boğa Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 5) {
            if (1 <= day && day <= 31) {
                if (day <= 20) {
                    System.out.println("Boğa Burcu");
                } else {
                    System.out.println("İkizler Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 6) {
            if (1 <= day && day <= 30) {
                if (day <= 20) {
                    System.out.println("İkizler Burcu");
                } else {
                    System.out.println("Yengeç Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 7) {
            if (1 <= day && day <= 31) {
                if (day <= 22) {
                    System.out.println("Yengeç Burcu");
                } else {
                    System.out.println("Aslan Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 8) {
            if (1 <= day && day <= 31) {
                if (day <= 22) {
                    System.out.println("Aslan Burcu");
                } else {
                    System.out.println("Başak Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 9) {
            if (1 <= day && day <= 30) {
                if (day <= 22) {
                    System.out.println("Başak Burcu");
                } else {
                    System.out.println("Terazi Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 10) {
            if (1 <= day && day <= 31) {
                if (day <= 22) {
                    System.out.println("Terazi Burcu");
                } else {
                    System.out.println("Akrep Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 11) {
            if (1 <= day && day <= 30) {
                if (day <= 22) {
                    System.out.println("Akrep Burcu");
                } else {
                    System.out.println("Yay Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }
        if (month == 12) {
            if (1 <= day && day <= 31) {
                if (day <= 21) {
                    System.out.println("Yay Burcu");
                } else {
                    System.out.println("Oğlak Burcu");
                }
            } else {
                System.out.println("Hatalı gün girdiniz!");
            }
        }

        else {
            System.out.println("Hatalı ay girdiniz!");
        }
    }
}
