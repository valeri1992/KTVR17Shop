/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import Interface.ConsoleInterface;
import Interface.Manageable;
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

   private List <Product> products= new ArrayList <>();
   private List <Customer>customers= new ArrayList <>();
     private List <Purchase>purchases= new ArrayList <>();
     private Manageable manager= new ConsoleInterface();
     
       public void run(){
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
                        repeat = "r";
                        break;
                   case 1:
                        this.products.add(manager.createProduct());
                        break;
                    case 2:
                        this.customers.add(manager.createCustomer());
                        break;
                    case 3:
                        this.purchases.add(manager.createPurchase(products, customers));
                        break;  
                    default:
                         System.out.println("Выберите одно из действий!");
                }
        }while("r".equals(repeat));
 
    }
}


