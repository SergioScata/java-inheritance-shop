package org.lessons.java.shop;

import java.math.BigDecimal;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<String> cart = new HashSet<>();


        boolean addOrNot = false;
        while (!addOrNot) {

            System.out.println("Ciao! Vuoi aggiungere un prodotto al carrello? (y/n)");
            String newProductOrNot = scan.nextLine();
            switch (newProductOrNot) {
                case "y":
                    System.out.println("Specifica se il prodotto è uno smartphone, un televisore o delle cuffie: ");
                    String categoryChoice = scan.nextLine();
                    if (categoryChoice.equals("smartphone")) {
                        System.out.println("Inserisci il nome del prodotto: ");
                        String name = scan.nextLine();
                        System.out.println("Inserisci la descrizione del prodotto: ");
                        String description = scan.nextLine();
                        System.out.println("Inserisci il prezzo del prodotto: ");
                        BigDecimal price = scan.nextBigDecimal();
                        System.out.println("Inserisci l'iva del prodotto: ");
                        BigDecimal iva = scan.nextBigDecimal();
                        System.out.println("Inserisci la memoria del prodotto");
                        int memory = Integer.parseInt(scan.next());
                        Smartphone smartphone = new Smartphone(name, description, price, iva, memory);
                        cart.add(String.valueOf(smartphone));
                    } else if (categoryChoice.equals("televisore")) {
                        System.out.println("Inserisci il nome del prodotto: ");
                        String name = scan.nextLine();
                        System.out.println("Inserisci la descrizione del prodotto: ");
                        String description = scan.nextLine();
                        System.out.println("Inserisci il prezzo del prodotto: ");
                        BigDecimal price = scan.nextBigDecimal();
                        System.out.println("Inserisci l'iva del prodotto: ");
                        BigDecimal iva = scan.nextBigDecimal();
                        System.out.println("Inserisci le dimensioni del televisore in pollici: ");
                        int size = Integer.parseInt(scan.next());
                        System.out.println("E' un televisore smart?(true/false)");
                        Boolean smartOrNot = scan.nextBoolean();
                        if (smartOrNot == true){
                            System.out.println("E' smart");
                        }else {
                            System.out.println("Se non è zuppa è pan bagnato");
                        }
                        Televisori tv = new Televisori(name, description,price, iva, size, smartOrNot);
                        cart.add(String.valueOf(tv));
                    } else if (categoryChoice.equals("cuffie")) {
                        System.out.println("Inserisci il nome del prodotto: ");
                        String name = scan.nextLine();
                        System.out.println("Inserisci la descrizione del prodotto: ");
                        String description = scan.nextLine();
                        System.out.println("Inserisci il prezzo del prodotto: ");
                        BigDecimal price = scan.nextBigDecimal();
                        System.out.println("Inserisci l'iva del prodotto: ");
                        BigDecimal iva = scan.nextBigDecimal();
                        System.out.println("Indicami il colore delle cuffie: ");
                        String color = scan.nextLine();
                        System.out.println("Sono cablate?(y/n)");
                        Boolean  cabledOrNot = scan.nextBoolean();
                        if (cabledOrNot == true){
                            System.out.println("E' cablato");
                        }else {
                            System.out.println("Se non è zuppa è pan bagnato");
                        }
                        Cuffie cuffie = new Cuffie(name,description,price,iva,color,cabledOrNot);
                        cart.add(String.valueOf(cuffie));
                    }else {
                        System.out.println("Risposta non valida");
                    }
                        break;


                case "n":
                System.out.println("Ok ecco a te i tuoi prodotti!");
                    System.out.println(cart.toString());
                addOrNot = true;
                break;
                default:
                    System.out.println("Riprova inserendo y/n");
                    break;

            }
            }

        scan.close();
        }
    }

