package controllers;

import models.Product;
import utils.Rounder;
import views.SalesView;

// Controller
public class ProductController {

    Product model;
    SalesView view;

    // Конструктор
    public ProductController(Product model, SalesView view) {
        this.model = model;
        this.view = view;
    }

    public void runApp() {

        // Здесь, реализуйте:
        // 1) получение имени товара через модель;
        // 2) вызов методов расчетов доходов и налога;
        // 3) округление расчетных значений;
        // 4) вывод расчетов по заданному формату.

        this.view.getInputs();
        String name = this.model.getName();
        double income = this.model.income(this.model.getQuantity(), this.model.getPrice());
        String incomeRounded = Rounder.roundValue(income);
        double tax = this.model.fiscal(income);
        String taxRounded = Rounder.roundValue(tax);
        String incomePureRounded = Rounder.roundValue(this.model.income(income, tax));
        String output = "Item`s name: " + name +
                "\nTotal income (UAH): " + incomeRounded +
                "\nTax amount (UAH): " + taxRounded +
                "\nPure income (UAH): " + incomePureRounded;

        view.getOutput(output);
    }
}
