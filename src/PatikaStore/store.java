package PatikaStore;

import java.util.Scanner;

public class store {
    Scanner input = new Scanner(System.in);

    public void run() {
        int number = 5;

        while (number != 0) {
            System.out.println("Patika Ürün Yönetim Paneli !" + "\n" +
                    "1 - Notebook Ýþlemleri" + "\n" +
                    "2 - Cep telefonu Ýþlemleri" + "\n" +
                    "3 - Markalarý Listele" + "\n" +
                    "0 - Çýkýþ yap");
            System.out.println("Seçim Yapýnýz:");
            number = input.nextInt();

            switch (number) {
                case 1:
                    new notebook().menu();
                    break;
                case 2:
                    new telefon().menu();
                    break;
                case 3:
                    new brand().showBrands();
                    break;
                case 0:
                    System.out.println("Sistemden çýkýþ yaptýnýz.");
                    break;
                default:
                    System.out.println("Hatalý seçim yaptýnýz.Tekrar deneyiniz.");
            }
        }
    }
}
