package fr.miage.agents.api.message.recherche;

import java.util.UUID;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;
import fr.miage.agents.api.model.Categorie;

/**
 * Created by nitix on 14/11/16.
 */
public class Rechercher extends Message {

    public int idProduit;

    public Categorie categorie;

    public String marque;

    public Double prixMax;

    public Double prixMin;
    
    public UUID session;
    
    public Rechercher() {
        super(TypeMessage.Recherche);
    }
}
