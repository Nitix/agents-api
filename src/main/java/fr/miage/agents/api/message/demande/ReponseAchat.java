package fr.miage.agents.api.message.demande;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

import java.util.UUID;

/**
 * Created by Arthur on 25/11/2016.
 */
public class ReponseAchat extends Message {

    public UUID session;

    public String nomProduit;

    public String marqueProduit;

    public int quantiteProduit;

    public float prixCalcule;

    public ReponseAchat() {
        super(TypeMessage.ReponseAchat);
    }
}