package utils;

import java.util.Scanner;

// Валидатор ввода значений
public class Validator {

    // Валидация ввода наименования
    public static String validateName(Scanner scanner) {
        String str = scanner.nextLine().trim();
        while (str.isEmpty()) {
            System.out.println("Empty! Enter the name of item: ");
            str = scanner.nextLine().trim();
        }
        return str;
    }

    // Валидация ввода количества
    public static int validateQuantityInput(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - is not a number!\n", str);
            System.out.println("Enter quantity!: ");
        }
        int quantity = scanner.nextInt();
        while (quantity <= 0) {
            System.out.println("Wrong input! Enter quantity: ");
            while (!scanner.hasNextInt()) {
                String str = scanner.next().trim();
                System.out.printf("\"%s\" - is not a number!\n", str);
                System.out.println("Enter quantity!: ");
            }
            quantity = scanner.nextInt();
        }
        return quantity;
    }

    // Валидация ввода цены
//    public static float validatePriceInput(Scanner scanner) {
//        while (!scanner.hasNextFloat()) {
//            String str = scanner.nextLine().trim();
//            System.out.printf("\"%s\" - не число!\n", str);
//            System.out.println("Введите цену!: ");
//        }
//        float price = scanner.nextFloat();
//        while (price <= 0) {
//            System.out.println("Неверное значение! Введите цену: ");
//            // здесь, реализуйте уведомление о неверном формате
//            while (!scanner.hasNextFloat()){
//                String str = scanner.nextLine().trim();
//                System.out.printf("\"%s\" - не число!\n", str);
//                System.out.println("Введите цену!: ");
//            }
//
//                price = scanner.nextFloat();
//        }
//        return price;
//    }

    public static double validatePriceInput(Scanner scanner) {
        while(!scanner.hasNextDouble()) {
            String str = scanner.nextLine().trim();
            System.out.printf("\"%s\" - is not a number!\n", str);
            System.out.println("Enter a price!: ");
        }

        double price;
        for(price = scanner.nextDouble(); price <= 0.0; price = scanner.nextDouble()) {
            System.out.println("Wrong input! Enter price: ");

            while(!scanner.hasNextDouble()) {
                String str = scanner.nextLine().trim();
                System.out.printf("\"%s\" - is not a number!\n", str);
                System.out.println("Enter price!: ");
            }
        }

        return price;
    }
}

