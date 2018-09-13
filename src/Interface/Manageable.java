/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;


import entity.Customer;
import entity.Product;
import entity.Purchase;
import java.util.List;

/**
 *
 * @author pupil
 */
public interface Manageable {
    public Product createProduct();
    public Customer createCustomer();
    public Purchase createPurchase(List<Product> products, List<Customer> customers);
    
}
    
