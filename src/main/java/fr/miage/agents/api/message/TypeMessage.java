package fr.miage.agents.api.message;

import fr.miage.agents.api.message.reponse.ResultatNegociation;
import fr.miage.agents.api.message.reponse.ResultatRecherche;

/**
 * Created by nitix on 14/11/16.
 */
public enum TypeMessage {

    Achat,
    Aide,
    DemandeDistance,
    NegocierPrix,
    PrevenirSolde,
    Recherche,

    ResultatRecherche,
    ResultatNegociation;
}
