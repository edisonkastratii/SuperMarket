package org.tech.edisonkastrati;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    private int quantity;
    private String name;
    private double price;
    private double VAT;
    private double discount;

    public Product(){

    }

    public Product(int quantity, String name, double price, double VAT) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.VAT = VAT;
    }

    public Product(int quantity, String name, double price, double VAT, double discount) {
        this.quantity = quantity;
        this.name = name;
        this.price = price;
        this.VAT = VAT;
        this.discount = discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
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
