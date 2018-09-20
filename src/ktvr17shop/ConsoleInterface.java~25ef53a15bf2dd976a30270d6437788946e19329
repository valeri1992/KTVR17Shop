/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ktvr17shop;

import Interface.Manageable;
import classes.CustomerCreator;
import classes.ProductCreator;
import classes.PurchaseCreator;
import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.List;

/**
 *
 * @author pupil
 */

public class ConsoleInterface implements Manageable{
     @Override
    public Product createProduct() {
        ProductCreator productCreator = new ProductCreator();
        return productCreator.returnNewProduct();
    }
     @Override
    public Customer createCustomer() {
        CustomerCreator customerCreator = new CustomerCreator();
        return customerCreator.returnNewCustomer();
    }
    public Purchase issueBook(List<Product> products, List<Customer> customers) {
        PurchaseCreator purchaseCreator = new PurchaseCreator();
        return purchaseCreator.returnNewPurchase(products, customers);
    }

    @Override
    public Purchase issueProduct(List<Product> products, List<Customer> customers) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean ProductCreator(List<Purchase> purchases) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void returnPurchase(List<Purchase> purchases) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   

}