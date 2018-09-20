/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import entity.Purchase;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 *
 * @author pupil
 */
public class PurchaseReturner {
        public void printListWhoTookproducts(List<Purchase> purchases){
        System.out.println("-----Добавить покупателя----");
        SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        int countPurchases = purchases.size();
        for(int i=0; i<countPurchases; i++){
            Purchase purchase = purchases.get(i);
            if(purchase==null){
                System.out.println(i + 1 + ". "+ purchase.getProduct().getName() + 
                        ". Купил: " +  purchase.getCustomer().getName()+
                        " " +  purchase.getCustomer().getSurname()+
                        ". Взято: " + sdfDate.format( purchase.getDate()));
            }
        }
    }
}
    

