package fr.miage.agents.api.message.recherche;

import fr.miage.agents.api.message.Message;
import fr.miage.agents.api.message.TypeMessage;
import fr.miage.agents.api.model.Produit;

import java.util.List;

/**
 * Created by nitix on 14/11/16.
 */
public class ResultatRecherche extends Message{
	
	/**
	 * ProduitUnique si la recherche est effectué sur une reférence
	 * le supermarché doit retourner le prix du produit
	 */
	
	public boolean isProduitUnique;
	
	public float prixProduitUnique;

    public List<Produit> produitList;

    public ResultatRecherche() {
        super(TypeMessage.ResultatRecherche);
    }
}
