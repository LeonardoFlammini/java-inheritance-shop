package org.excercises.javashop;

public class JavaShop {
    public static void main(String[] args) {

    Product jeans = new Product("Levis","Bei Pantaloni",34.5,22);
    Product tshirt = new Product("Maglietta nera","Nerissima",23.6,10);


        System.out.println("Codice Jeans: " + jeans.getCode());
        System.out.println("Nome Jeans: " + jeans.getName());
        System.out.println("Descrizione Jeans: " + jeans.getDescription());
        System.out.println("Prezzo Jeans: " + jeans.getPrice());
        System.out.println("IVA Jeans: " + jeans.getVat());
        System.out.println("Prezzo con IVA Jeans: " + jeans.getVattedPrice());
        System.out.println("Nome completo Jeans: " + jeans.getFullName());


        System.out.println("***********");

        System.out.println("Codice T-Shirt: " + tshirt.getCode());
        System.out.println("Nome T-Shirt: " + tshirt.getName());
        System.out.println("Descrizione T-Shirt: " + tshirt.getDescription());
        System.out.println("Prezzo T-Shirt: " + tshirt.getPrice());
        System.out.println("IVA T-Shirt: " + tshirt.getVat());
        System.out.println("Prezzo con IVA T-Shirt: " + tshirt.getVattedPrice());
        System.out.println("Nome completo T-Shirt: " + tshirt.getFullName());


        jeans.setName("Gucci");
        jeans.setDescription("Pantaloni di lusso");
        jeans.setPrice(120.5);
        jeans.setVat(24);


        tshirt.setName("T-Shirt Bianca");
        tshirt.setDescription("Bianchissima");
        tshirt.setPrice(30.6);
        tshirt.setVat(12);

        System.out.println("Codice Jeans: " + jeans.getCode());
        System.out.println("Nome Jeans: " + jeans.getName());
        System.out.println("Descrizione Jeans: " + jeans.getDescription());
        System.out.println("Prezzo Jeans: " + jeans.getPrice());
        System.out.println("IVA Jeans: " + jeans.getVat());
        System.out.println("Prezzo con IVA Jeans: " + jeans.getVattedPrice());
        System.out.println("Nome completo Jeans: " + jeans.getFullName());


        System.out.println("***********");

        System.out.println("Codice T-Shirt: " + tshirt.getCode());
        System.out.println("Nome T-Shirt: " + tshirt.getName());
        System.out.println("Descrizione T-Shirt: " + tshirt.getDescription());
        System.out.println("Prezzo T-Shirt: " + tshirt.getPrice());
        System.out.println("IVA T-Shirt: " + tshirt.getVat());
        System.out.println("Prezzo con IVA T-Shirt: " + tshirt.getVattedPrice());
        System.out.println("Nome completo T-Shirt: " + tshirt.getFullName());


    }
}
