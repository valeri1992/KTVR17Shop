/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Product;
import java.util.Scanner;

/**
 *
 * @author pupil
 */
public class ProductCreator {
    public Product returnNewProduct(){
        Scanner scanner=new Scanner(System.in);
          System.out.println("---Добавить новый продукт---");
        Product product=new Product();
        System.out.println("--- Продукт Name---");
        product.setName(scanner.nextLine());
        System.out.println("--- Продукт Price---");
        product.setPrice(scanner.nextInt());
       System.out.println("--- Продукт Count---");
        product.setCount(scanner.nextInt());
        System.out.println("---Для добавления введите любой символ\nДля отмены наберите -1---");
        
        String yes="";
        yes = scanner.next();
        if ("-1".equals(yes)){
        System.out.println("---Продукт не добавлен ---");
        return null;
        }else{
           System.out.println("---Продукт добавлен---");
           return product;
        }
        
       // System.out.println("---Название продукта---");
       // product.setName(scanner.nextLine());
      //  System.out.println("---Цена одного продукта---");
       // product.setPrice(scanner.nextInt());
      //  System.out.println("---Количество продукта в штуках---");
      //  product.setCount(scanner.nextInt());
      //  return  product;
                
    }
}
