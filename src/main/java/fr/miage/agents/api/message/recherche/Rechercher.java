package fr.miage.agents.api.message.recherche;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by nitix on 14/11/16.
 */
public class Rechercher extends Message {

    public String reference;

    public String nomCategorie;

    public String marque;

    public Double prixMax;

    public Double prixMin;

    public Rechercher() {
        super(TypeMessage.Recherche);
    }
}
