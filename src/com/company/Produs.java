package com.company;

import com.sun.jdi.connect.spi.TransportService;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Produs {
    public List<Ingredient> listaIngrediente = new LinkedList<Ingredient>();
    private double pret;
    private String categorie;
    private String nume;

    public Produs(List<Ingredient> listaIngrediente, double pret, String categorie) {
        this.listaIngrediente = listaIngrediente;
        this.pret = pret;
        this.categorie = categorie;
    }


    public double getPret() {
        return pret;
    }

    public String getCategorie() {
        return categorie;
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

    public List<Ingredient> listaIngredientePizza = new LinkedList<>();

    

    Produs pizza = new Produs(listaIngredientePizza, 32, "Pizza");
}
