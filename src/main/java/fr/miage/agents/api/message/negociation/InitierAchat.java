package fr.miage.agents.api.message.negociation;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by nitix on 30/11/16.
 */
public class InitierAchat extends Message {

    public long idProduit;

    public int quantite;

    public InitierAchat() {
        super(TypeMessage.InitierAchat);
    }
}
