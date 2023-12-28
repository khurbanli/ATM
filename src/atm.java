import java.util.Scanner;

public class atm {
    private static double mebleg = 1000; // Başlangıç bakiyesi

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ABB Bankına xoş gəlmisiniz");

        while (true) {
            System.out.println("\n=== ATM Menu ===");
            System.out.println("1. Cari Məbləğ");
            System.out.println("2. Pul çıxarma");
            System.out.println("3. Pul yatırma");
            System.out.println("4. Çıxış");

            System.out.print("Zəhmət olmasa istədiyiniz əməliyyatı daxil edin(1-4): ");
            int select = scanner.nextInt();
            switch (select) {
                case 1:
                    cariBalans();
                    break;
                case 2:
                    pulCixar();
                    break;
                case 3:
                    pulYatir();
                    break;
                case 4:
                    System.out.println("Təşəkkür Edirik.");
                    System.exit(0);
                default:
                    System.out.println("Xəta baş verdi!!\nZəhmət olmasa yenidən sınayın");
            }
        }
    }

    private static void cariBalans() {
        System.out.println("Cari Məbləğ: " + mebleg + " AZN");
    }

    private static void pulCixar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Çıxarmaq istədiyiniz məbləği daxil edin: ");
        double miqdar = scanner.nextDouble();

        if (miqdar > 0 && miqdar <= mebleg) {
            mebleg -= miqdar;
            System.out.println("Əməliyyat yerinə yetirilidi.\nQalan Məbləğ: " + mebleg + " AZN");
        } else {
            System.out.println("Balansda kifayyət qədər məbləğ yoxdur.");
        }
    }

    private static void pulYatir() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yatırmağ istədiyiniz miqdarı daxil edin: ");
        double miqdar = scanner.nextDouble();

        if (miqdar > 0) {
            mebleg += miqdar;
            System.out.println("Əməliyyat uğurlu oldu.\nYeni Cari Məbləğiniz: " + mebleg + " AZN");
        } else {
            System.out.println("Zəhmət olmasa düzgün rəqəm daxil edin!");
        }
    }
}