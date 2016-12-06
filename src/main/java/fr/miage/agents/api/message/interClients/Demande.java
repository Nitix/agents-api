package fr.miage.agents.api.message.interClients;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by jerome on 06/12/2016.
 */
public class Demande extends Message{

    public String produitDemande;
    public int quantiteDemande;

    public Demande(String produitDemande, int quantiteDemande) {
        super(TypeMessage.DemandeEchange);
        this.produitDemande = produitDemande;
        this.quantiteDemande = quantiteDemande;
    }
}
