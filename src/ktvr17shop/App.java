/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import Interface.Manageable;
import Interface.Retentive;
import classes.CustomerCreator;
import classes.ProductCreator;
import classes.PurchaseCreator;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */


public class App {

    private List<Product> products ;
    private List<Customer> customers; 
    private List<Purchase> purchases;
    private final Manageable manager = new ConsoleInterface();
    private List<Purchase> purchase;
    private final Retentive saver = new PersistToDatabase();

    public App() {
        this.products = saver.loadProducts();
        this.customers = saver.loadCustomers();
        this.purchases = saver.loadPurchases();

    }

    public void run() {
        String repeat = "r";
        Scanner scanner = new Scanner(System.in);
        int task;
        do {
            System.out.println("  - Выберите действие -");
            System.out.println("0 - Выход из программы -");
            System.out.println("1 - Добавить продукт -");
            System.out.println("2 - Добавить нового клиента-");
            System.out.println("3 - Покупка -");

            task = scanner.nextInt();
            switch (task) {
                case 0:
                    repeat = "n";
                    break;
                case 1:
                    Product product = manager.createProduct();
                    if (product != null) {
                        products.add(product);
                        saver.saveProduct(product);
                    }
                    break;
                case 2:
                    Customer customer = manager.createCustomer();
                    if (customer != null) {
                        customers.add(customer);
                        saver.saveCustomer(customer);
                    }
                    break;
                case 3:
                    Purchase purchase = manager.createPurchase(products, customers);
                    if (purchase != null) {
                        purchases.add(purchase);
                        saver.savePurchase(purchase, false);
                    }
                    break;

                default:
                    System.out.println("Выберите одно из действий!");
            }
        } while ("r".equals(repeat));
        System.out.println("До свидания!");
    }
}
