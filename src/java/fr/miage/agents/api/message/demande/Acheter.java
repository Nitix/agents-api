package fr.miage.agents.api.message.demande;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by nitix on 14/11/16.
 */
public class Acheter extends Message {

    public String session;

    public boolean accepter;

    public Acheter() {
        super(TypeMessage.Achat);
    }
}
