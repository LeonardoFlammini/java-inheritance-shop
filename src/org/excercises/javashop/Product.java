package org.excercises.javashop;

import java.util.Random;

public class Product {

    Random random = new Random();

    private int code;
    private String name;
    private String description;
    private double price;
    private double vat;

    //Costruttore
    public Product(String name,String description,double price,double vat){
        this.code = random.nextInt(0,999999);
        this.name = name;
        this.description = description;
        this.price = price;
        this.vat = vat;
    }

    //Setter
    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setVat(double vat){
        this.vat = vat;
    }

    //Getter
    public String getCode(){
        return String.format("%06d",this.code);
    }
    public String getName(){
        return this.name;
    }
    public String getDescription(){
        return this.description;
    }
    public double getPrice(){
        return this.price;
    }
    public double getVat(){
        return this.vat;
    }

    public double getVattedPrice() {
        return this.price + (this.price * this.vat / 100);
    }
    public String getFullName(){
        return String.format("%s-%s",this.name,getCode());
    }


}
