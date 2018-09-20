/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Customer;
import entity.LibHistory;
import entity.Product;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author agloi
 */
public class LibHistoryCreator {
 public LibHistory returnNewLibHistory(List<Product> products, List<Customer> customers){
        System.out.println("-----Продажа------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Список товаров: ");
        int countProducts = products.size();
        for(int i = 0; i<countProducts; i++){
            System.out.println(i+1+". "+products.get(i).getName());
        }
        System.out.println("Список клиентов: ");
        int countCustomers = customers.size();
        for(int i = 0; i<countCustomers; i++){
            System.out.println(i+1+". "+customers.get(i).getName()+" "+customers.get(i).getSurname());
        }
        System.out.println("Выберите номер товара:");
        int numberProduct = scanner.nextInt();
        Product product = products.get(numberProduct-1);
        System.out.println("Выберите номер клиента:");
        int numberCustomer = scanner.nextInt();
        Customer customer = customers.get(numberCustomer-1);
        Calendar c = new GregorianCalendar();
        LibHistory libHistory = new LibHistory(null, product, customer, c.getTime(), null);
        return libHistory;
    }
}
