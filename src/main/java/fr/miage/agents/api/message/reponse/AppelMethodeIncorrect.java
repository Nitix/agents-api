package fr.miage.agents.api.message.reponse;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by nitix on 28/11/16.
 */
public class AppelMethodeIncorrect extends Message {

    public AppelMethodeIncorrect() {
        super(TypeMessage.AppelMethodeIncorrect);
    }

}
