package fr.miage.agents.api.message.production;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;

/**
 * Created by Alexandre on 06/12/2016.
 */
public class Production extends Message {

    public long id;

    public String nomProduit;

    public int quantiteProduit;

    public int newQuantiteProduit;

    public String marqueProduit;


    public Production() {
        super(TypeMessage.Production);
    }



}