package fr.miage.agents.api.message.reponse;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by Arthur on 21/11/2016.
 */
public class ResultatNegociation extends Message {

    private boolean accepterRefuser;

    private float prixNegocie;

    public ResultatNegociation() {
        super(TypeMessage.ResultatNegociation);
    }
}
