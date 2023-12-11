package org.lessons.java.shop;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private BigDecimal  price;
    private BigDecimal iva;

    public Prodotto(String name, String description, BigDecimal price, BigDecimal iva) {
        code = randomCode();
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getIva() {
        return iva;
    }


    private int randomCode(){
       Random random = new Random();
       return random.nextInt(100000, 999999);
    }
    public BigDecimal getFullPrice(){
        BigDecimal ivaOnPrice = price.multiply(iva);
        return price.add(ivaOnPrice).setScale(2, RoundingMode.HALF_EVEN);
    }

    @Override
    public String toString() {
        return "Prodotto{" +
                "code=" + code +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", iva=" + iva +
                '}';
    }
}
