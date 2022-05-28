package models;


import base.Fiscal;
import base.Income;

// Model.
// Примените интерфейсы Income, Fiscal, переопределите их методы.
public class Product implements Fiscal, Income {

    // Объявление полей модели
    private String name;
    private int quantity;
    private double price;

    // Налоговоу ставку объявите в виде константы
    // здесь ...

    private static final int TAX_RATE = 5;

    // Обеспечьте доступ к полям модели через getters и setters
    // здесь ...

    public Product() {

    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Переопределите методы реализуемых интерфейсов.

    @Override
    public double fiscal(double sales) {
        return sales * TAX_RATE / 100.0D;
    }

    @Override
    public double income(int quota, double price) {
        return (double) quota * price;
    }

    @Override
    public double income(double sales, double tax) {
        return sales - tax;
    }

    // Расчёт дохода от продаж, до уплаты налога.
    // здесь ...

//    public double calculateIncome(int quota, double price) {
//        return (double) quota * price;
//    }

    // Расчёт суммы налога с продаж.
    // здесь ...

//    public double calculateTax(double sales) {
//        return sales * TAX_RATE / 100.0D;
//    }


    // Расчёт чистого дохода, после уплаты налога.
    // здесь ...

//    public double calculateIncomePure(double sales, double tax) {
//        return sales - tax;
//    }

}
