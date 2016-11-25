package fr.miage.agents.api.message.demande;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by Arthur on 25/11/2016.
 */
public class ReponseAchat extends Message {

    public int idSession;

    public String nomProduit;

    public String marqueProduit;

    public int quantiteProduit;

    public float prixCalcule;

    public ReponseAchat() {
        super(TypeMessage.ReponseAchat);
    }
}