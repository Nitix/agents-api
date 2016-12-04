package fr.miage.agents.api.message.negociation;

import java.util.UUID;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by nitix on 30/11/16.
 */
public class InitierAchat extends Message {

    public int idProduit;

    public int quantite;
    
    public InitierAchat() {
        super(TypeMessage.InitierAchat);
    }
}
