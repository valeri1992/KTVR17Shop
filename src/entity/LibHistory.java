/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author agloi
 */
public class LibHistory {
     private Long id;
    private Product product;
    private Customer customer;
    private Date ProductIssued;
    private Date ProductReturn;

    public LibHistory() {
    }

    public LibHistory(Long id, Product product, Customer customer, Date ProductIssued, Date ProductReturn) {
        this.id = id;
        this.product = product;
        this.customer = customer;
        this.ProductIssued = ProductIssued;
        this.ProductReturn = ProductReturn;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getProductIssued() {
        return ProductIssued;
    }

    public void setProductIssued(Date ProductIssued) {
        this.ProductIssued = ProductIssued;
    }

    public Date getProductReturn() {
        return ProductReturn;
    }

    public void setProductReturn(Date ProductReturn) {
        this.ProductReturn = ProductReturn;
    }

    @Override
    public String toString() {
        return "LibHistory{" + "id=" + id + ", product=" + product + ", customer=" + customer + ", ProductIssued=" + ProductIssued + ", ProductReturn=" + ProductReturn + '}';
    }

 }