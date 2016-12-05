package fr.miage.agents.api.message.recherche;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;
import fr.miage.agents.api.model.Categorie;

/**
 * Created by nitix on 14/11/16.
 */
public class Rechercher extends Message {

    public long idProduit;

    public Categorie categorie;

    public String marque;

    public float prixMax;

    public float prixMin;

    public Rechercher() {
        super(TypeMessage.Recherche);
    }
}
