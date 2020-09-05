package com.company;

import java.util.ArrayList;

public class Produs {
    private ArrayList<Ingredient> listaIngrediente = new ArrayList<Ingredient>();
    private double pret;
    private String categorie;
    private String nume;

    public Produs(ArrayList<Ingredient> listaIngrediente, double pret, String categorie) {
        this.listaIngrediente = listaIngrediente;
        this.pret = pret;
        this.categorie = categorie;
    }

    public ArrayList<Ingredient> getListaIngrediente() {
        return listaIngrediente;
    }

    public double getPret() {
        return pret;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setListaIngrediente(ArrayList<Ingredient> listaIngrediente) {
        this.listaIngrediente = listaIngrediente;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    Produs pizza = new Produs(listaIngrediente, 32, "Pizza");
}
