package PatikaStore;

import java.util.Scanner;

public class store {
    Scanner input = new Scanner(System.in);

    public void run() {
        int number = 5;

        while (number != 0) {
            System.out.println("Patika Product Management Panel !" + "\n" +
                    "1 - Notebook Operations" + "\n" +
                    "2 - Telephone Operations" + "\n" +
                    "3 - List Brands" + "\n" +
                    "0 - Exit");
            System.out.println("Make your choice :");
            number = input.nextInt();

            switch (number) {
                case 1:
                    new notebook().menu();
                    break;
                case 2:
                    new telephone().menu();
                    break;
                case 3:
                    new brand().showBrands();
                    break;
                case 0:
                    System.out.println("You logged out of the panel.");
                    break;
                default:
                    System.out.println("You made the wrong choice. Please try again.");
            }
        }
    }
}
