package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto{
    private String color;
    private String cabledOrNot;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCabledOrNot() {
        return cabledOrNot;
    }

    public void setCabledOrNot(String cabledOrNot) {
        this.cabledOrNot = cabledOrNot;
    }

    public Cuffie(String name, String description, BigDecimal price, BigDecimal iva, String color, String cabledOrNot) {
        super(name, description, price, iva);
        this.color = color;
        if (cabledOrNot.equals("y")){
            this.cabledOrNot = "cabled";
        } else if (cabledOrNot.equals("n")) {
           this.cabledOrNot = "wireless";
        }else  {
            System.out.println("Risposta non valida");
        }
    }
}
