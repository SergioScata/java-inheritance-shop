package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Smartphone extends Prodotto{
    private int imeiCode;
    private int memory;

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getImeiCode() {
        return imeiCode;
    }

    public int getMemory() {
        return memory;
    }

    public Smartphone(String name, String description, BigDecimal price, BigDecimal iva, int memory) {
        super(name, description, price, iva);
        this.memory = memory;
        imeiCode = randomCode();
    }



    private int randomCode(){
        Random random = new Random();
        return random.nextInt(1000000, 9999999);
    }
}
