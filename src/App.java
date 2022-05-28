

// Входная точка в программу/приложение

import controllers.ProductController;
import models.Product;
import views.SalesView;

public class App {
    public App() {

    }

    public static void main(String[] args) {

        Product model = new Product();
        SalesView view = new SalesView(model);
        ProductController controller = new ProductController(model, view);
        controller.runApp();

        // Здесь создайте экземпляры Model, View и Controller,
        // на основании соответствующих конструкторов.
//        Product model = создать экземпляр
//        SalesView view = создать экземпляр
//        ProductController controller = создать экземпляр

        // Запуск программы/приложения.
        // Раскомментированный код будет корректным после
        // правильной настройки приложения
        // controller.runApp();
    }
}
