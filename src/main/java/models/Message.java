package models;

public class Message {
	
	protected Utilisateur auteur ;
	protected Destinataire destinaire ;
	protected String texte ;
	
	
	
	
	
	public Message() {
		super();
	}





	public Message(Utilisateur auteur, Destinataire destinaire, String texte) {
		super();
		this.auteur = auteur;
		this.destinaire = destinaire;
		this.texte = texte;
	}

	
}
