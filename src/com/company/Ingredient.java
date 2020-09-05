package com.company;

public class Ingredient {

    private String nume;
    private double pret;
    private int cantitate;

    public Ingredient(String nume, double pret, int cantitate) {
        this.nume = nume;
        this.pret = pret;
        this.cantitate = cantitate;
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

    public int getCantitate() {
        return cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }

    Ingredient lapte = new Ingredient("Lapte", 5, 1);
    Ingredient faina = new Ingredient("Faina", 3, 1);
    Ingredient drojdie = new Ingredient("Drojdie", 2, 1);
    Ingredient apa = new Ingredient("Apa", 1, 1);
}
