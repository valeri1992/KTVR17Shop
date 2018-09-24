/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class PurchaseCreator {
    public Purchase returnNewPurchase(List<Product>products,List<Customer>customers){
        System.out.println("-----------Покупка------------");
        Scanner scanner = new Scanner(System.in);
         System.out.println("Список продуктов: ");
         int countProducts=products.size();
        for (int i = 0; i < countProducts; i++) {

            System.out.println(i+1+". "+products.get(i).getName()
                    +" "+products.get(i).getCount()
                    +": "+products.get(i).getPrice());
        }
        System.out.println("Список клиентов: ");
         int countCustomers=customers.size();
        for (int i = 0; i < countCustomers; i++) {

            System.out.println(i+1+". "+customers.get(i).getName()
                    +" "+customers.get(i).getSurname()
                    +": "+customers.get(i).getMoney( ));
        }
        System.out.println("Выберите номер продукта: ");
        int numberProduct = scanner.nextInt();
        Product product = products.get(numberProduct - 1);
        System.out.println("Выберите номер клиента: ");
        int numberCustomer = scanner.nextInt();
        Customer customer = customers.get(numberCustomer - 1);
        System.out.println("Количество в шт.: ");
        int quantity = scanner.nextInt();
        Calendar c = new GregorianCalendar();
        Purchase purchase = new Purchase(null, product, customer, c.getTime(), quantity);

       // purchase.getCustomer().setMoney(purchase.getCustomer().getMoney()- purchase.getProduct().getPrice()*purchase.getQuantity());
// Проверка на наличие у нас Product и  у Customer денег
//        purchase.getProduct().setCount(purchase.getProduct().getCount()- quantity);
        if (product.getCount()< purchase.getQuantity()){
        System.out.println("Извените,у нас нет такого количества");
        return null;
        }

//        purchase.getCustomer().setMoney(purchase.getCustomer().getMoney()-purchase.getProduct().getPrice()*quantity);
        if (customer.getMoney()<= product.getPrice()*purchase.getQuantity()){
                System.out.println("Извините.У Вас не хватает денег");
        return null;
        }

        return purchase;
    }}

