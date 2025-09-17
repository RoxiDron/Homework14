package org.skypro.skyshop;

import org.skypro.skyshop.basket.ProductBasket;
import org.skypro.skyshop.product.Product;

public class App {
    public static void main(String[] args) {
        // Создаем косметические продукты
        Product lipstick = new Product("Помада Rouge", 1500);
        Product foundation = new Product("Тональный крем Perfect", 2500);
        Product mascara = new Product("Тушь для ресниц Volume", 1200);
        Product perfume = new Product("Духи Fleur", 5000);
        Product faceCream = new Product("Крем для лица Hydra", 2000);
        Product eyeShadow = new Product("Палетка теней", 1800);
        Product missingProduct = new Product("Пудра матирующая", 1600);


        ProductBasket basket = new ProductBasket();

        System.out.println("\n1. Добавление продукта в пустую корзину:");
        basket.addProduct(lipstick);
        System.out.println("Помада добавлена успешно!");


        System.out.println("\n2. Добавление нескольких продуктов:");
        basket.addProduct(foundation);
        basket.addProduct(mascara);
        basket.addProduct(perfume);
        basket.addProduct(faceCream);
        System.out.println("Основные товары добавлены!");


        System.out.println("\n3. Попытка добавить в заполненную корзину:");
        basket.addProduct(eyeShadow);

        System.out.println("\n4. Содержимое корзины:");
        basket.printContents();

        System.out.println("\n5. Общая стоимость корзины:");
        System.out.println("Итого: " + basket.getTotalPrice() + " рублей");

        System.out.println("\n6. Поиск существующего товара:");
        System.out.println("Есть ли помада? " + basket.containsProduct("Помада Rouge"));

        System.out.println("\n7. Поиск несуществующего товара:");
        System.out.println("Есть ли пудра? " + basket.containsProduct("Пудра матирующая"));

        System.out.println("\n8. Очищаем корзину:");
        basket.clear();

        System.out.println("\n9. Содержимое пустой корзины:");
        basket.printContents();

        System.out.println("\n10. Стоимость пустой корзины:");
        System.out.println("Итого: " + basket.getTotalPrice() + " рублей");

        System.out.println("\n11. Поиск в пустой корзине:");
        System.out.println("Есть ли помада теперь? " + basket.containsProduct("Помада Rouge"));
    }
}
