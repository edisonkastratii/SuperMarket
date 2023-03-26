package org.tech.edisonkastrati;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Market {
    private String name;
    private double price;
    private double VAT;
    private double discount;

    public Market(){

    }

    public Market(String name, double price, double VAT, double discount) {
        this.name = name;
        this.price = price;
        this.VAT = VAT;
        this.discount = discount;
    }

    public Market(String name, double price, double VAT) {
        this.name = name;
        this.price = price;
        this.VAT = VAT;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getVAT() {
        return VAT;
    }

    public void setVAT(double VAT) {
        this.VAT = VAT;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
