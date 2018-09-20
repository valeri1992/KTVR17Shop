/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author pupil
 */@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private Long Id;
    private String name; 
    private String surname;
    private Integer money;

    public Customer() {
    }
    public Customer(Long Id, String name, String surname, Integer money) {
        this.Id = Id;
        this.name = name;
        this.surname = surname;
        this.money = money;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getMoney() {
        return money;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.Id);
        hash = 79 * hash + Objects.hashCode(this.name);
        hash = 79 * hash + Objects.hashCode(this.surname);
        hash = 79 * hash + Objects.hashCode(this.money);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Customer other = (Customer) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        if (!Objects.equals(this.Id, other.Id)) {
            return false;
        }
        if (!Objects.equals(this.money, other.money)) {
            return false;
        }
        return true;
    }

    public void setId(Long Id) {
        this.Id = Id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" + "Id=" + Id + ", name=" + name + ", surname=" + surname + ", money=" + money + '}';
    }


    
}
