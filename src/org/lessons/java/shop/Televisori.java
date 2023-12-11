package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto{
private int size;
private Boolean smartOrNot;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Boolean getSmartOrNot() {
        return smartOrNot;
    }

    public void setSmartOrNot(Boolean smartOrNot) {
        this.smartOrNot = smartOrNot;
    }

    public Televisori(String name, String description, BigDecimal price, BigDecimal iva, int size, Boolean smartOrNot) {
        super(name, description, price, iva);
        this.size = size;
        this.smartOrNot = smartOrNot;
    }
}
