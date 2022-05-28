package views;


import models.Product;
import utils.Validator;
import java.util.Scanner;

// View
public class SalesView {

    Product model;
    String title;
    String name;
    int quantity;
    double price;
    Scanner scanner;

    // Здесь, создайте конструктор данного класса,
    // который в параметре содержит переменную типа модели.
    public SalesView(Product model) {
        this.model = model;
    }

    public void getInputs() {

        this.scanner = new Scanner(System.in);

        this.title = "Enter the name of item: ";
        System.out.println(this.title);
        this.name = Validator.validateName(this.scanner);
        this.model.setName(this.name);
        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.


        this.title = "Enter quantity: ";
        System.out.println(this.title);
        this.quantity = Validator.validateQuantityInput(this.scanner);
        this.model.setQuantity(this.quantity);

        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        this.title = "Enter the price: ";
        System.out.println(this.title);
        this.price = (double)Validator.validatePriceInput(this.scanner);
        this.model.setPrice(this.price);

        // Здесь, реализуйте вывод сообщения о необходимсоти
        // ввода соответствующего значения, валидацью значения
        // через валидатор, установку валидного значения через модель.

        this.scanner.close();
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}
