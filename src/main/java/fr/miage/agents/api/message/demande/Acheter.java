package fr.miage.agents.api.message.demande;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by nitix on 14/11/16.
 */
public class Acheter extends Message {

    public String nomProduit;

    public String marqueProduit;

    public int quantiteProduit;

    public Acheter() {
        super(TypeMessage.Achat);
    }
}
