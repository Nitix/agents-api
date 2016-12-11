package fr.miage.agents.api.message.interClients;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;
import fr.miage.agents.api.model.Produit;

import java.util.HashMap;

/**
 * Created by jerome on 06/12/2016.
 */
public class ReponseEchange extends Message{

    public boolean possedeProduit;

    public Produit produit;
    public double prix;

    public Produit compensation;
    public int quantiteCompensation;

    public ReponseEchange() {
        super(TypeMessage.ReponseEchange);
    }

    public ReponseEchange(boolean possedeProduit, Produit produit, double prix, Produit compensation, int quantiteCompensation) {
        super(TypeMessage.ReponseEchange);
        this.possedeProduit = possedeProduit;
        this.produit = produit;
        this.prix = prix;
        this.compensation = compensation;
        this.quantiteCompensation = quantiteCompensation;
    }
}
