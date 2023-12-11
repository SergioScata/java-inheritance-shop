package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{
private int size;
private String smartOrNot;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSmartOrNot() {
        return smartOrNot;
    }

    public void setSmartOrNot(String smartOrNot) {
        this.smartOrNot = smartOrNot;
    }

    public Televisori(String name, String description, BigDecimal price, BigDecimal iva, int size, String smartOrNot) {
        super(name, description, price, iva);
        this.size = size;
        if (smartOrNot.equals("y")){
            this.smartOrNot = "smart";
        } else if (smartOrNot.equals("n")) {
            this.smartOrNot = "wireless";
        }
    }
}
