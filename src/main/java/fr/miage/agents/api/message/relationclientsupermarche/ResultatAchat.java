package fr.miage.agents.api.message.relationclientsupermarche;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

import java.util.Map;
import java.util.UUID;

/**
 * Created by nitix on 30/11/16.
 */
public class ResultatAchat extends Message{

    public UUID session;

    /**
     * La premiere clé correspond à l'id du produit
     * La valeur correspond à la map qui contient : 
     * une clé booléen si l'achat a été effectué ou non
     * une valeur correspondant à la quantité disponible si à l'achat, 
     * la quantité demandée dépassait le stock disponible du supermarché
     */
    public Map<Integer,Map<Boolean,Integer>> courses;

    public ResultatAchat() {
        super(TypeMessage.ResultatInitiationAchat);
    }
}
