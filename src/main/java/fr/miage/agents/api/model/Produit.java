package fr.miage.agents.api.model;

import java.io.Serializable;

/**
 * Created by Guillaume on 07/11/2016.
 */
public class Produit implements Serializable {
    public int idProduit;

    public String nomProduit;

    public String descriptionProduit;

    public float prixProduit;

    public int quantiteProduit;

    public Categorie idCategorie;

    public String marque;
}
