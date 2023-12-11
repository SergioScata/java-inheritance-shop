package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String color;
    private Boolean cabledOrNot;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getCabledOrNot() {
        return cabledOrNot;
    }

    public void setCabledOrNot(Boolean cabledOrNot) {
        this.cabledOrNot = cabledOrNot;
    }

    public Cuffie(String name, String description, BigDecimal price, BigDecimal iva, String color, Boolean cabledOrNot) {
        super(name, description, price, iva);
        this.color = color;
        this.cabledOrNot = cabledOrNot;
    }
}
