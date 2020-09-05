package com.company;

public class Ingredient {

    private String nume;
    private double pret;


    public Ingredient(String nume, double pret) {
        this.nume = nume;
        this.pret = pret;

    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }


    Ingredient lapte = new Ingredient("Lapte", 5);
    Ingredient faina = new Ingredient("Faina", 3);
    Ingredient drojdie = new Ingredient("Drojdie", 2);
    Ingredient apa = new Ingredient("Apa", 1);
}
